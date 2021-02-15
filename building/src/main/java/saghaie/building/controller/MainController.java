package saghaie.building.controller;

import org.hibernate.cache.internal.StandardTimestampsCacheFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import saghaie.building.Exception.ResourceNotFoundException;
import saghaie.building.model.building;
import saghaie.building.repository.buildingRepository;
import saghaie.building.run.BuildingApplication;

import javax.validation.Valid;
import java.util.List;


@Controller
public class MainController {

    private static final Logger logger = LoggerFactory.getLogger(BuildingApplication.class);

    @Autowired
    private buildingRepository repository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String PrintHelloWorld(ModelMap modelMap){

        // add attribute to load modelMap
        modelMap.addAttribute("message",
                "Hello World and Welcome to Spring MVC!");

        // return the name of the file to be loaded "hello_world.jsp"
        return "index";
    }

    @GetMapping("/buildings")
    public List<building> GetAllBuildings() {
        System.out.println("Get all the building...");
        logger.info("Get all the building...");
        return repository.findAll();
    }

    @GetMapping("/buildings/{id}")
    public ResponseEntity<building> GetBuildingById(@PathVariable(value = "id") long buildingId) throws ResourceNotFoundException {
        System.out.println("Get building by id...");
        logger.info("Get building by id...");
        building building = repository.findById(buildingId).
                orElseThrow(() -> new ResourceNotFoundException("building not found for this id:: " + buildingId));
        return ResponseEntity.ok().body(building);
    }

    @GetMapping("/buildings/{name}")
    public ResponseEntity<List<building>> GetBuildingByName(@PathVariable(value = "buildingName") String buildingName) throws ResourceNotFoundException {
        logger.info("Get building by name...");
        System.out.println("Get building by name...");
        List<building> building = repository.findByName(buildingName);
//                orElseThrow(() -> new ResourceNotFoundException("building not found for this name:: " + buildingName));
        return ResponseEntity.ok().body(building);
    }

    @PostMapping("/buildings")
    public building CreateBuilding(@Valid @RequestBody building building) {
        System.out.println("Insert building...");
        return repository.save(building);
    }

    @PutMapping("/building/{id}")
    public ResponseEntity<building>UpdateBuildingById(@PathVariable(value = "id") long buildingId, @RequestBody building updatedBuilding) throws ResourceNotFoundException {
        logger.info("Update building...");
        System.out.println("Update building...");
        building building = repository.findById(buildingId).
                orElseThrow(() -> new ResourceNotFoundException("building not found for this id:: " + buildingId));
        building.setBuildingName(updatedBuilding.getBuildingName());
        building.setAddressID(updatedBuilding.getAddressID());
        building.setManagers(updatedBuilding.getManagers());
        building.setBankAccounts(updatedBuilding.getBankAccounts());
        building.setFundBalance(updatedBuilding.getFundBalance());
        building.setNumberOfUnits(updatedBuilding.getNumberOfUnits());
        return ResponseEntity.ok().body(building);
    }

    @DeleteMapping("/building/{id}")
    public void deleteBuilding(@PathVariable(value = "id") long buildingId) throws ResourceNotFoundException {
        logger.info("Delete building...");
        System.out.println("Delete building...");
        building building = repository.findById(buildingId).
                orElseThrow(() -> new ResourceNotFoundException("building not found for this id:: " + buildingId));
        repository.delete(building);
    }

}


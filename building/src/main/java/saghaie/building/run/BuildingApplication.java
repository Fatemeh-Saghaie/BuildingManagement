package saghaie.building.run;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = { "saghaie.building.model" })
@EnableJpaRepositories(basePackages = { "saghaie.building.repository" })

public class BuildingApplication {


    private static final Logger logger = LoggerFactory.getLogger(BuildingApplication.class);

    public static void main(String[] args) {
        logger.info("Init the application...");
        SpringApplication.run(BuildingApplication.class, args);
    }

}

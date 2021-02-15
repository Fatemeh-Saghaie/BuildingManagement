package saghaie.building.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "unit")
public class unit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @ManyToOne(targetEntity=building.class, fetch=FetchType.EAGER)
    @JoinColumn(name="building")
    private building building;

    @OneToOne(targetEntity=person.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "landlord")
    private person landlord;

    @OneToOne(targetEntity=person.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "tenant")
    private person tenant;

    @Column(name = "locationInBuilding")
    private String locationInBuilding;

    @Column(name = "remainingInTheFund")
    private Long remainingInTheFund;

    @Column(name = "size")
    private Long size;

    @Column(name = "numberOfPersons")
    private Long numberOfPersons;

    @Column(name = "monthlyChargeAmount")
    private Long monthlyChargeAmount;

    public unit(){

    }

    public unit(saghaie.building.model.building building, person landlord, person tenant, String locationInBuilding, Long remainingInTheFund, Long size, Long numberOfPersons, Long monthlyChargeAmount) {
        this.building = building;
        this.landlord = landlord;
        this.tenant = tenant;
        this.locationInBuilding = locationInBuilding;
        this.remainingInTheFund = remainingInTheFund;
        this.size = size;
        this.numberOfPersons = numberOfPersons;
        this.monthlyChargeAmount = monthlyChargeAmount;
    }

    public long getId() {
        return id;
    }

    public saghaie.building.model.building getBuilding() {
        return building;
    }

    public void setBuilding(saghaie.building.model.building building) {
        this.building = building;
    }

    public person getLandlord() {
        return landlord;
    }

    public void setLandlord(person landlord) {
        this.landlord = landlord;
    }

    public person getTenant() {
        return tenant;
    }

    public void setTenant(person tenant) {
        this.tenant = tenant;
    }

    public String getLocationInBuilding() {
        return locationInBuilding;
    }

    public void setLocationInBuilding(String locationInBuilding) {
        this.locationInBuilding = locationInBuilding;
    }

    public Long getRemainingInTheFund() {
        return remainingInTheFund;
    }

    public void setRemainingInTheFund(Long remainingInTheFund) {
        this.remainingInTheFund = remainingInTheFund;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getNumberOfPersons() {
        return numberOfPersons;
    }

    public void setNumberOfPersons(Long numberOfPersons) {
        this.numberOfPersons = numberOfPersons;
    }

    public Long getMonthlyChargeAmount() {
        return monthlyChargeAmount;
    }

    public void setMonthlyChargeAmount(Long monthlyChargeAmount) {
        this.monthlyChargeAmount = monthlyChargeAmount;
    }
}

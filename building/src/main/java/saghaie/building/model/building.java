package saghaie.building.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "building")
public class building {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "buildingName")
    private String buildingName;

    @OneToOne(targetEntity=address.class, fetch=FetchType.EAGER)
    @JoinColumn(name="addressID")
    private Long addressID;

    @OneToMany(targetEntity=person.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "manager")
    private List<person> managers;

    @OneToMany(targetEntity=bankAccount.class, fetch=FetchType.EAGER)
    @JoinColumn(name = "bankAccount")
    private List<bankAccount> bankAccounts;

    @Column(name = "fundBalance")
    private Long fundBalance;

    @Column(name = "numberOfUnits")
    private int numberOfUnits;

    public building(){

    }

    public building(String buildingName, Long addressID, List<person> managers, List<bankAccount> bankAccounts, Long fundBalance, int numberOfUnits) {
        this.buildingName = buildingName;
        this.addressID = addressID;
        this.managers = managers;
        this.bankAccounts = bankAccounts;
        this.fundBalance = fundBalance;
        this.numberOfUnits = numberOfUnits;
    }

    public long getId() {
        return id;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public Long getAddressID() {
        return addressID;
    }

    public void setAddressID(Long addressID) {
        this.addressID = addressID;
    }

    public List<person> getManagers() {
        return managers;
    }

    public void setManagers(List<person> managers) {
        this.managers = managers;
    }

    public List<bankAccount> getBankAccounts() {
        return bankAccounts;
    }

    public void setBankAccounts(List<bankAccount> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    public Long getFundBalance() {
        return fundBalance;
    }

    public void setFundBalance(Long fundBalance) {
        this.fundBalance = fundBalance;
    }

    public int getNumberOfUnits() {
        return numberOfUnits;
    }

    public void setNumberOfUnits(int numberOfUnits) {
        this.numberOfUnits = numberOfUnits;
    }

    @Override
    public String toString() {
        return "building [id=" + id + ", building name=" + buildingName + ", managers=" + managers+ ", bank accounts=" + bankAccounts+ ", fund balance=" + fundBalance +", number of units=" + numberOfUnits + "]";
    }
}

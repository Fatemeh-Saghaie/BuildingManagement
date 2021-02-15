package saghaie.building.model;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long addressID;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @Column(name = "neighbourhood")
    private String neighbourhood;

    @Column(name = "postalAddress")
    private String postalAddress;

    @Column(name = "postalCode")
    private int postalCode;

    public address(){

    }

    public address(String state, String city, String neighbourhood, String postalAddress, int postalCode) {
        this.state = state;
        this.city = city;
        this.neighbourhood = neighbourhood;
        this.postalAddress = postalAddress;
        this.postalCode = postalCode;
    }

    public long getAddressID() {
        return addressID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
}

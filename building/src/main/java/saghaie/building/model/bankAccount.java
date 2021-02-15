package saghaie.building.model;

import javax.persistence.*;

@Entity
@Table(name = "bankAccount")
public class bankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "accountName")
    private String accountName;

    @Column(name = "accountNumber")
    private int accountNumber;

    @Column(name = "cardNumber")
    private int cardNumber;

    public bankAccount(){

    }

    public bankAccount(String accountName, int accountNumber, int cardNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
        this.cardNumber = cardNumber;
    }

    public long getId() {
        return id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}

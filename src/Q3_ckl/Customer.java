package Q3_ckl;

import java.util.Vector;

/**
 * Created by KLC on 10/10/2015.
 */
public class Customer {
    private String name;
    private String address;
    private Vector<Account> allAccounts;

    public Customer() {
        this.allAccounts = new Vector<Account>();
    }

    public Customer(String name, String address) {
        this();
        this.setName(name);
        this.setAddress(address);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setAllAccounts(Vector<Account> allAccounts) {
        this.allAccounts = allAccounts;
    }

    public Vector<Account> getAllAccounts() {
        return this.allAccounts;
    }

    public String toString() {
        return " |Name: " + getName() + " |Address: " + getAddress();
    }
}

package Q3_ckl;

import java.util.Vector;

/**
 * Created by KLC on 10/10/2015.
 */
public class Client {
    private String name;
    private String address;
    private Vector<InternationalAccount> allAccounts;

    public Client() {
        this.allAccounts = new Vector<InternationalAccount>();
    }

    public Client(String name, String address) {
        this();
        this.name = name;
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<InternationalAccount> getAllAccount() {
        return this.allAccounts;
    }

    public String toString() {
        return " |Client: " + getName() + " |Address: " + getAddress();
    }
}

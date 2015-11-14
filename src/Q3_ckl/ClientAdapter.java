package Q3_ckl;

import java.util.Vector;

public class ClientAdapter extends Client {
    private Customer customer;
    private Vector<InternationalAccount> accountsAdapter;

    public ClientAdapter(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return customer.getName();
    }

    public void setName(String name) {
        customer.setName(name);
    }

    public String getAddress() {
        return customer.getAddress();
    }

    public void setAddress(String address) {
        customer.setAddress(address);
    }

    public Vector<InternationalAccount> getAllAccounts() {
        this.accountsAdapter = new Vector<InternationalAccount>();
        for(Account accounts : customer.getAllAccounts()) {
            this.accountsAdapter.add(new IAAdapter(accounts));
        }
        return this.accountsAdapter;
    }

    public String toString() {
        return " |Client: " + getName() + " |Address: " + getAddress();
    }
}


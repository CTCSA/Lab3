package Q3;


import java.util.Vector;

public class ClientAdapter extends Client {
    private Customer customer;
    

    public ClientAdapter(Customer customer) {
        this.customer = customer;
    }

    public String getName() {
        return this.customer.getName();
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

    public Vector<InternationalAccount> getAccountsAdapter() {
        Vector accountsAdapter = new Vector();
        for(Account accounts : customer.getAllAccounts()) {
            accountsAdapter.addElement(new IntlAccAdapter(accounts));
        }
        return accountsAdapter;
    }

    public String toString() {
        return " |Client: " + getName() + " |Address: " + getAddress();
    }
}

package Q3_ckl;

import com.sun.javafx.binding.StringFormatter;

import java.util.Vector;

/**
 * Created by KLC on 10/10/2015.
 */
public class Main {
    public static void main(String[] args) {


        System.out.println("<-----------------------Part 1 Start----------------------->");
        Customer customer = new Customer("Chan1", "TY1231");
        Account account = new Account("001", 10000.00);
        Account account1 = new Account("002", 19921.00);

        customer.getAllAccounts().add(account);
        customer.getAllAccounts().add(account1);

        account.setCustomer(customer);
        account1.setCustomer(customer);

        System.out.println(customer);
        for(Account accounts : customer.getAllAccounts()) {
            System.out.println("\t|-" + accounts);
        }
        System.out.println("<-----------------------Part 1 End----------------------->\n");

        System.out.println("<-----------------------Part 2 Start----------------------->");
        Client client = new Client("Chan2", "TY12121");
        InternationalAccount ia = new InternationalAccount("001", 10001.00, "HKD");
        InternationalAccount ia2 = new InternationalAccount("002", 10021.00, "USD");

        client.getAllAccount().add(ia);
        client.getAllAccount().add(ia2);

        ia.setClient(client);
        ia2.setClient(client);

        System.out.println(client);
        for(InternationalAccount accounts : client.getAllAccount()) {
            System.out.println("\t|- " + accounts);
        }
        System.out.println("<-----------------------Part 2 End----------------------->\n");

        System.out.println("<-----------------------Part 3 Start----------------------->");
        Client clientAdapter = new ClientAdapter(customer);
        InternationalAccount ia3 = new IAAdapter(account);
        InternationalAccount ia4 = new IAAdapter(account1);

        clientAdapter.getAllAccount().add(ia3);
        clientAdapter.getAllAccount().add(ia4);
        ia3.setClient(clientAdapter);
        ia4.setClient(clientAdapter);

        System.out.println(clientAdapter);
        for(InternationalAccount accounts : clientAdapter.getAllAccount()) {
            System.out.println("\t|- " + accounts);
        }
        System.out.println("<-----------------------Part 3 End----------------------->\n");
    }
}

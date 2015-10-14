/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;
import java.util.*;
/**
 *
 * @author ckc
 */
public class Main {
    public static void main(String arg[]){
    Customer customer = new Customer();
    
    Vector allAccounts = new Vector();
    
    allAccounts.addElement(new Account("ckc",120,customer));
    customer.setAllAccounts(allAccounts);
    Client cle = new ClientAdapter(customer);
    for(InternationalAccount a:cle.getAccountsAdapter())
    System.out.println(a.getAccountnumber());
    }
}

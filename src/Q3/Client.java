/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3;
import java.util.*;
/**
 *
 * @author a1
 */
public class Client {
    
    private String name;
    private String address;
    private Vector<InternationalAccount> accountsAdapter = new Vector<InternationalAccount>();

    public Vector<InternationalAccount> getAccountsAdapter() {
        return accountsAdapter;
    }

    public void setAccountsAdapter(Vector<InternationalAccount> accountsAdapter) {
        this.accountsAdapter = accountsAdapter;
    }
    public String getName(){
        return name;
    }
    
    public void setName(String xname){
        this.name = xname;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String xaddress){
        this.address = xaddress;
    }
    
    
}

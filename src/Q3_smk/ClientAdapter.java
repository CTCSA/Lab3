/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3_smk;

import java.util.ArrayList;

/**
 *
 * @author a1
 */
public class ClientAdapter extends Client {
    Customer adaptee; 
    
    public ClientAdapter(Customer adaptee){
        this.adaptee = adaptee;
    }
    
    public void setName(String name) {
        adaptee.setName(name);
    }

    public String getAddress() {
        return adaptee.getAddress();
    }

    public void setAddress(String address) {
        adaptee.setAddress(address);
    }
    public String getName() {
       return adaptee.getName();
    }
    
    public ArrayList<InternationalAccount> getAccount(){
        ArrayList<InternationalAccount> temp = new ArrayList<InternationalAccount>();
        for(Account c: adaptee.getAcoount()){
            temp.add(new AccountAdapter(c));
        }
        return temp;
        
    }
    public void setAccount(ArrayList<InternationalAccount> account) {
        ArrayList<Account> temp = new ArrayList<Account>();
        
        for(InternationalAccount ia : account){
           
            temp.add(new Account(ia.getAccountno(),ia.getBalance(), new Customer(ia.getClient().getName(),ia.getClient().getAddress())));
        }
        this.adaptee.setAcoount(temp);
    }
    
}

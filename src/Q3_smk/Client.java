/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3_smk;

import java.util.*;

/**
 *
 * @author a1
 */
public class Client {

    public ArrayList<InternationalAccount> getAccount() {
        return account;
    }

    public void setAccount(ArrayList<InternationalAccount> account) {
        this.account = account;
    }
    private ArrayList<InternationalAccount> account;
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
    private String name;
    private String address;
    
    public Client(String name,String address){
        this.address = address;
        this.name = name;
        this. account = new ArrayList<InternationalAccount>();
    }
    
    public Client(){}
    
}

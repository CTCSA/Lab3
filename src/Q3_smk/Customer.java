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
public class Customer {

    public ArrayList<Account> getAcoount() {
        return acoount;
    }

    public void setAcoount(ArrayList<Account> acoount) {
        this.acoount = acoount;
    }
    private ArrayList<Account> acoount;
    
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
    
    public Customer(String name,String address){
        this.address = address;
        this.name = name;
    }
    
    public Customer(){}
    
    
}

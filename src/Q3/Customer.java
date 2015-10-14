package Q3;

import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author a1
 */
public class Customer {
        private String address;
        private String name;
        private Vector<Account> allAccounts;
        
    private ArrayList<Account> account = new ArrayList<Account>();

    public ArrayList<Account> getAccount() {
        return account;
    }

    public String getAddress() {
        return address;
    }
    
    public String getName() {
        return name;
    }
    
    public void setAllAccounts(Vector<Account> allAccounts) {
        this.allAccounts = allAccounts;
    }  
    
    public Vector<Account> getAllAccounts() {
        return this.allAccounts;
    }
    
    public void setAccount(ArrayList<Account> account) {
        this.account = account;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

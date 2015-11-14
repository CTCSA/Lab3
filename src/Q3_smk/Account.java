/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Q3_smk;

/**
 *
 * @author a1
 */
public class Account {
    String accountno;
    double balance;
    Customer customer;
    public Account(){}
    
    Account(String accountno, double balance, Customer customer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void debit(double amount){
        this.balance = balance - amount;
    }
    
    public void credit(double amount){
        this.balance = balance + amount;
    }
    
    public double getBalance (){
        return balance;
    }
    
}

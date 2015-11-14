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
public class AccountAdapter extends InternationalAccount  {
    Account adaptee;
    
    public AccountAdapter(Account adaptee){
        this.adaptee = adaptee;
    }
    
    public String getAccountno() {
        return adaptee.accountno;
    }

    public void setAccountno(String accountno) {
        this.adaptee.accountno = accountno;
    }

    public double getBalance() {
        return adaptee.balance;
    }

    public void setBalance(double balance) {
        this.adaptee.balance = balance;
    }

    public Client getClient() {
        return new ClientAdapter(adaptee.customer);
    }
    public void increase(double amount){
        adaptee.credit(amount);
    }
    
    public void decrease(double amount){
        adaptee.debit(amount); 
    }
    
    
    
}

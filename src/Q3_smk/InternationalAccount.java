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
public class InternationalAccount {
    ForeginExchangeCalculator fec = new ForeginExchangeCalculator();
    
    public void increase(double amount){
        this.balance = balance + amount;
    }
    
    public void decrease(double amount){
        this.balance = balance - amount;
    }
    
    public double showbalance(){
        return balance;
    }
    
    public double showbalanceUSD(){
        return fec.HKD2USD(balance);
    }
    
    public String getAccountno() {
        return accountno;
    }

    public void setAccountno(String accountno) {
        this.accountno = accountno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
    private String accountno;
    private double balance;
    private String currency;

    public ForeginExchangeCalculator getFec() {
        return fec;
    }

    public void setFec(ForeginExchangeCalculator fec) {
        this.fec = fec;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    private Client client;
    
    public InternationalAccount(){}
    public InternationalAccount(String accountno,double balance,String currency,Client client){
        this.accountno = accountno;
        this.balance =balance;
        this.currency = currency;
        this.client = client; 
    }
    
    
    
    
    
    
    
    
    
}

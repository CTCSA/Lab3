/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Q3;

/**
 *
 * @author ckc
 */
public class IntlAccAdapter extends InternationalAccount {

    private Account account;

    public IntlAccAdapter(Account account) {
        this.account = account;
    }
    
    
    public double getBalance() {
        return account.getBalance();
    }

    public String getAccountNumber() {
        return account.getAccountNumber();
    }

    public void setAccountNumber(String accountNumber) {
        account.setAccountNumber(accountNumber);
    }

    public void decrease(double amount) {
        account.debit(amount);
    }

    public void increase(double amount) {
        account.credit(amount);
    }

    public Client getClient() {
        return new ClientAdapter(account.getCustomer());
    }

    public String toString() {
        return " |AccountNo: " + getAccountNumber() + " |Balance: " + getBalance();
    }
    
    
}

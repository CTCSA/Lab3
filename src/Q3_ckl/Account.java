package Q3_ckl;

import java.util.Vector;

public class Account {

    private String accountNumber;
    private double balance;
    private Customer customer;

    public Account() {}
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void debit(double amount) {
        this.balance = balance - amount;
    }

    public void credit(double amount) {
        this.balance = balance + amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return " |AccountNo: " + getAccountNumber() + " |Balance: " + getBalance();
    }

}

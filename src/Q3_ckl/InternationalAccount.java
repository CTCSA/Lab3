package Q3_ckl;
/**
 * Created by KLC on 10/10/2015.
 */
public class InternationalAccount {
    private String accountNumber;
    private double balance;
    private String currency;
    private Client client;
    private ForeignExchangeCalculator fec;

    public InternationalAccount() {}
    public InternationalAccount(String accountNumber, double balance, String currency) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void increase(double amount) {
        this.balance = balance + amount;
    }

    public void decrease(double amount) {
        this.balance = balance - amount;
    }

    public double showbalance() {
        return this.balance;
    }

    public double showbalanceInUSD() {
        fec = new ForeignExchangeCalculator();
        return fec.HKD2USD(this.showbalance());
    }

    public String toString() {
        if(currency.equals("HKD")) {
            return " |AccountNo: " + getAccountNumber() + " |Balance: " + showbalance() + " |Currency: " + getCurrency();
        } else {
            return " |AccountNo: " + getAccountNumber() + " |Balance: " + showbalanceInUSD() + " |Currency: " + getCurrency();
        }
    }
}

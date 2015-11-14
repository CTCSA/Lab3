package Q3_ckl;

public class IAAdapter extends InternationalAccount {
    private Account account;

    public IAAdapter(Account account) {
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

    public void debit(double amount) {
        account.debit(amount);
    }

    public void credit(double amount) {
        account.credit(amount);
    }

    public Client getClient() {
        return new ClientAdapter(account.getCustomer());
    }

    public String toString() {
        return " |AccountNo: " + getAccountNumber() + " |Balance: " + getBalance();
    }

}

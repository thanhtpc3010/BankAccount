package Entity;

public class SavingAccount extends BankAccount{
    public SavingAccount() {;}
    public SavingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }
    public void setBalance(double balance) {
        super.setBalance(balance);
    }
    public double getBalance() {
        return super.getBalance();
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of $" + amount + " succesful. Current balance is:$ " + getBalance());
        }else{
            System.out.println("Insufficient funds.Withdraw failed )");
        }
    }
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposited of $ " + amount + " succesful .Current balance $ " + getBalance());
    }
}

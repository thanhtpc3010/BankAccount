package Entity;

public class CurrentAccount extends BankAccount{

    public CurrentAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
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
        System.out.println("Deposit of $" + amount + " succesful.Current balance " + getBalance());
    }
}


import Entity.CurrentAccount;
import Entity.SavingAccount;

public class Main {
    public static void main(String[] args) {
        double ibal,damt,wamt;
        ibal =1000;
        SavingAccount savingAccount =new SavingAccount("SA001",ibal);
        System.out.println("Saving A/c: Initial Balance :$"+ibal);
        damt =500;
        SavingAccount savingAccount2 =new SavingAccount("SA002",damt);
        System.out.println("Saving A/c: Initial Balance :$"+damt);
        wamt =250;
        SavingAccount savingAccount3 =new SavingAccount("SA003",wamt);
        System.out.println("Saving A/c: Initial Balance :$"+wamt);
        System.out.println();
        ibal = 5000;
        CurrentAccount currentAccount=new CurrentAccount("CA001",ibal);
        System.out.println("Current A/c: Initial Balance :$"+ibal);
        damt =2500;
        currentAccount.deposit(1000);
        wamt =1250;
        currentAccount.withdraw(3000);
        wamt = 6000;
        System.out.println("\n Try to withdraw :$"+wamt);
        savingAccount.withdraw(wamt);
    }
}
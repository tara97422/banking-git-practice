public class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance=1200;

    public String deposit(double amount){
        if(amount<=0)
            return "Invalid deposit amount";
        balance=balance+amount;
        System.out.println("Amount deposited: " + amount);
        return "Account balance :" + balance;
    }


}
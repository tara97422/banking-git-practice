public class BankAccount {

    private long accountNumber;
    private String accountHolder;
    private double balance = 5000;
    public String deposit(double amount){
        if(amount<=0)
            return "Invalid deposit amount";
        balance=balance+amount;
        System.out.println("Amount deposited: " + amount);
        return "Account balance :" + balance;
    }

    public String calculateInterest(double rate) {
        double interest = balance * rate / 100;
        return "Interest: " + interest;
    }


    public String getBalance(){
        return "balance"+balance;
    }


}
package Oops;

public class  BankAccount{
    String bankname;
    String IFSC_code;
    double balance; 
    Long Account_No;

    void debit (double amount){
        balance=balance-amount;
    }
    void credit(double amount){
        balance=balance+amount;
    }

    void displaybalance(){
        System.out.println(balance);
    }
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        b1.balance=10000;
        BankAccount b2=new BankAccount();
        b2.balance=12000;
    }
}

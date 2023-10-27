package main.java.moocfihelsinki.account;

public class Account{
    private Double balance;

    public Account(){
        this.balance=0.0;
    }

    public Account(Double initialBalance){
        this.balance=initialBalance;
    }

    public void withdraw(Double ammount){
        if(this.balance-ammount< 0.0){
            throw new ArithmeticException("Ammount to withdraw larger than current funds");
        }
        this.balance-=ammount;
    }

    public void deposit(Double ammount){
        this.balance+=ammount;
    }

    public Double getBalance() {
        return balance;
    };
    
}
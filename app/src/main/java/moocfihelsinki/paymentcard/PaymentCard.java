package moocfihelsinki.paymentcard;

public class PaymentCard {
    private Double balance;

    public PaymentCard(Double initialBalance){
        this.balance = initialBalance;
    }

    public String toString(){
        return "The card has a balance of " + this.balance.toString() + " euros"; 
    }

    public void eatAffordably(){
        if(this.balance-2.60<0.0){
            throw new ArithmeticException("Lack of funds");
        }
        this.balance-=2.60;
    }

    public void eatHeartily(){
        if(this.balance-4.60 < 0.0){
            throw new ArithmeticException("Lack of funds");
        }
        this.balance-=4.60;
    }

    public void addMoney(Double ammount){
        if((this.balance+ammount)>=150.0 && ammount > 0.0){
            this.balance=150.00;
        }
        else{
            this.balance+=ammount;
        }
        
    }
}

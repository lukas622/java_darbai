public class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        balance = openingBalance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros";
    }
    
    public void eatAffordably() {
        balance -= 2.6;
    }
    
    public void eatHeartily() {
        balance -= 4.6;
    }
}

import java.util.ArrayList;

public class CashRegister {
    private ArrayList<Money> moneyStorage = new ArrayList<>();

    public CashRegister() {}

    public void addMoney(Money money) {
        if (moneyStorage.contains(money)) return;

        moneyStorage.add(money);
    }

    public void printAllMoney() {
        for (Money m : moneyStorage) {
            System.out.println("Value: " + m.getValue() + ", Quantity: " + m.getQuantity());
        }
    }

    public double calculateChange(double paid, double toPay) {
        if (paid <= toPay) return 0;

        double change = paid-toPay;

        return change;
    }
}

public class Money {
    private double value;
    private int quantity;

    public Money(double value, int quantity) {
        this.value = value;
        this.quantity = quantity;
    }

    public double getValue() {
        return value;
    }

    public int getQuantity() {
        return quantity;
    }
}

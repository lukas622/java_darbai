public class Product {
    private double price;
    private int quantity;
    private String name;

    public Product(String initialName, double initialPrice, int initialQuantity) {
        name = initialName;
        price = initialPrice;
        quantity = initialQuantity;
    }

    public void printProduct() {
        System.out.println(name + ", price " + Double.toString(price) + ", " + Integer.toString(quantity) + " pcs");
    }
}

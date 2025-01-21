import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductStorage {
    private ArrayList<Product> storage = new ArrayList<>();

    public ProductStorage() {}

    public void addProduct(Product product) {
        if (storage.contains(product)) return;
        storage.add(product);
    }

    public void printAllProducts() {
        for (Product p : storage) {
            System.out.println(p.getName() + " | Quantity: " + p.getQuantity());
        }
    }

    public List<Product> getStorage() {
        return storage;
    }

    public boolean deductProduct(String productName, int amount) {
        for (Product p : storage) {
            if (p.getName().equals(productName)) {
                p.setQuantity(p.getQuantity()-amount);
                return true;
            }
        }
        return false;
    }

    public Product findProduct(String productName) {
        for (Product p : storage) {
            if (productName.equals(p.getName())) {
                System.out.println("You are trying to buy " + p.getName() + ". You need to pay " + p.getPrice());
                return p;
            }
        }
        System.out.println("Product '" + productName + "' does not exist!");
        return null;
    }
}

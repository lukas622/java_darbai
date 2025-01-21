import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        SupermarketServiceImpl supermarket = SupermarketServiceImpl.getInstance();

        ProductStorage storage = supermarket.getProductStorage();

        storage.addProduct(new Product("APPLE", 1.5, 20));
        storage.addProduct(new Product("BANANA", 1.7, 8));
        storage.addProduct(new Product("BREAD", 0.8, 60));
        storage.addProduct(new Product("MILK", 2, 10));

        CashRegister cashRegister = supermarket.getCashRegister();

        cashRegister.addMoney(new Money(0.5, 20));
        cashRegister.addMoney(new Money(1.0, 10));
        cashRegister.addMoney(new Money(2.0, 10));
        cashRegister.addMoney(new Money(0.1, 50));

        Scanner userInput = new Scanner(System.in);
        Scanner userNumericInput = new Scanner(System.in);
        String answer = "";

        while (!Objects.equals(answer, "exit")) {
            System.out.println("Welcome to TECHIN Supermarket!\n");

            System.out.println("Initial Product Inventory:");
            storage.printAllProducts();

            System.out.println("\nInitial Cash Inventory:");
            cashRegister.printAllMoney();

            System.out.print("\nWhat would you like to buy? Type in the name of the desired product: ");
            answer = userInput.nextLine();

            Product product = storage.findProduct(answer);

            if (product == null) break;

            System.out.println("\nProvide bill or coin (accepted values: 0.1, 0.5, 1, 2)");

            double paid = 0;
            double toPay = product.getPrice();
            double payAmount = 0;

            while (paid != toPay) {
                payAmount = Double.parseDouble(userNumericInput.nextLine());

                if (payAmount != 0.1 && payAmount != 0.5 && payAmount != 1 && payAmount != 2) continue;

                paid += payAmount;
                System.out.println("You paid " + String.format("%.2f", paid) + " in total.\nYou still need to pay " + String.format("%.2f", toPay - paid));
            }
        }
    }
}

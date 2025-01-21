public interface SupermarketService {
    CashRegister getCashRegister();
    ProductStorage getProductStorage();
    void order(String productName, int amount);
}

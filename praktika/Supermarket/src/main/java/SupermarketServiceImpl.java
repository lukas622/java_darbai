public class SupermarketServiceImpl implements SupermarketService {
    private static SupermarketServiceImpl service = new SupermarketServiceImpl();
    private static CashRegister cashRegister = new CashRegister();
    private static ProductStorage productStorage = new ProductStorage();

    private SupermarketServiceImpl() {}


    public static SupermarketServiceImpl getInstance() {
        return service;
    }

    @Override
    public CashRegister getCashRegister() {
        return cashRegister;
    }

    @Override
    public ProductStorage getProductStorage() {
        return productStorage;
    }

    @Override
    public void order(String productName, int amount) {
        // If we can't find the product we cancel. If we do, we deduct the quantity
        if (!productStorage.deductProduct(productName, amount)) return;
    }
}

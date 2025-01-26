package lt.techin.strategy;

import java.util.List;

public class WarehouseImpl implements Warehouse{
    List<Product> storage;

    public WarehouseImpl() {}

    @Override
    public void addProducts(List<Product> products) {
        storage = products;
    }

    @Override
    public int getNumberOfProducts() {
        return storage.size();
    }

    @Override
    public List<Product> executeFilteringStrategy(FilteringStrategy strategy) {
        strategy.filter((Product) storage);
        return List.of();
    }
}

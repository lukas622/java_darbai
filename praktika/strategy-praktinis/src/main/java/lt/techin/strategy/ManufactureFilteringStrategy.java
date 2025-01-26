package lt.techin.strategy;

public interface ManufactureFilteringStrategy extends FilteringStrategy {
    @Override
    boolean filter(Product product);
}

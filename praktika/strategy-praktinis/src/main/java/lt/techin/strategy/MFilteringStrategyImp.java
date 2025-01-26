package lt.techin.strategy;

public class MFilteringStrategyImp implements ManufactureFilteringStrategy {
    @Override
    public boolean filter(Product product) {
        return false;
    }
}

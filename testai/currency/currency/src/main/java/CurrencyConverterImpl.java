import lt.itakademija.exam.*;

public class CurrencyConverterImpl implements CurrencyConverter {

    private CurrencyRatesProvider provider;

    public CurrencyConverterImpl(CurrencyRatesProvider provider) {
        this.provider = provider;
    }

    @Override
    public Money convert(Currency currency, Currency currency1, Money money) {
        if (currency == null || currency1 == null || provider.getRate(currency, currency1) == null) throw new CurrencyConversionException("Invalid Currency!");

        money = money.multiply(provider.getRate(currency, currency1));

        return money;
    }
}

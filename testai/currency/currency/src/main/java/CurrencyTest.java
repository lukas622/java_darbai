import lt.itakademija.exam.Bank;
import lt.itakademija.exam.CurrencyConverter;
import lt.itakademija.exam.CurrencyRatesProvider;
import lt.itakademija.exam.test.BaseTest;

public class CurrencyTest implements BaseTest {
    @Override
    protected Bank createBank(CurrencyConverter currencyConverter) {
        return null;
    }

    @Override
    protected CurrencyConverter createCurrencyConverter(CurrencyRatesProvider currencyRatesProvider) {
        return null;
    }
}

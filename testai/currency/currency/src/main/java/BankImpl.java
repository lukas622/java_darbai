import lt.itakademija.exam.*;

import java.util.ArrayList;
import java.util.List;

public class BankImpl implements Bank {
    private long CustomerIDIndex = 0;
    private long AccountIDIndex = 0;
    private long OperationIDIndex = 0;
    private CurrencyConverter converter;

    private List<Customer> CustomersList = new ArrayList<>();

    public BankImpl(CurrencyConverter converter) {
        this.converter = converter;
    }

    public void customerExists(PersonCode personCode) {
        for (Customer c : CustomersList) {
            if (c.getPersonCode().equals(personCode)) {
                throw new CustomerCreateException("This customer already exists!");
            }
        }
    }

    @Override
    public Customer createCustomer(PersonCode personCode, PersonName personName) {
        if (personCode == null || personName == null) throw new NullPointerException();

        customerExists(personCode);

        CustomerIDIndex++;

        Customer newcustomer = new Customer(CustomerIDIndex, personCode, personName);

        CustomersList.add(newcustomer);

        return newcustomer;
    }

    @Override
    public Account createAccount(Customer customer, Currency currency) {
        if (customer == null || currency == null) throw new NullPointerException();

        if (!CustomersList.contains(customer)) throw new AccountCreateException("Can't create an account for a non existing customer!");

        AccountIDIndex++;

        Account newaccount = new Account(AccountIDIndex, customer, currency, new Money(0));

        customer.addAccount(newaccount);

        return newaccount;
    }

    @Override
    public Operation transferMoney(Account account, Account account1, Money money) {
        if (account.getBalance().isLessThan(money)) throw new InsufficientFundsException("Insufficient balance!");

        Money creditAmount = money;

        if (!account.getCurrency().equals(account1.getCurrency())) {
            creditAmount = converter.convert(account.getCurrency(), account1.getCurrency(), money);
        }

        account.setBalance(account.getBalance().substract(money));
        account1.setBalance(account1.getBalance().add(creditAmount));

        OperationIDIndex++;

        return new Operation(OperationIDIndex, account, account1, money);
    }

    @Override
    public Money getBalance(Currency currency) {
        Money total = new Money(0);

        for (Customer c : CustomersList) {
            for (Account a : c.getAccounts()) {
                if (a.getCurrency().equals(currency)) {
                    total = total.add(a.getBalance());
                }
            }
        }

        return total;
    }
}

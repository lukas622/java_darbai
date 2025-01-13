public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        id = 0;
        balance = 0;
        annualInterestRate = 0;
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        annualInterestRate = 0;
    }

    public int getID() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setID(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double rate) {
        annualInterestRate = rate;
    }

    public Date getDate() {
        return dateCreated;
    }

    public double getMonthlyInterestRate() {
        return annualInterestRate/12;
    }

    public double getMonthlyInterest() {
        return annualInterestRate/12;
    }
}

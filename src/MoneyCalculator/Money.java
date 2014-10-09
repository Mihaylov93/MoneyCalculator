package MoneyCalculator;

public class Money {
    private final double ammount;
    private final String currency;

    public Money(double ammount, String currency) {
        this.ammount = ammount;
        this.currency = currency;
    }

    public double getAmmount() {
        return ammount;
    }

    public String getCurrency() {
        return currency;
    }
    
    
}

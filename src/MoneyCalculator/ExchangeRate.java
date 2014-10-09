package MoneyCalculator;

import java.util.Calendar;

public class ExchangeRate {
    private final Currency in;
    private final int value;
    private final Currency out;
    private final Calendar date;

    public ExchangeRate(Currency in, int value, Currency out, Calendar date) {
        this.in = in;
        this.value = value;
        this.out = out;
        this.date = date;
    } 
    
    public Currency getIn() {
        return in;
    }

    public int getValue() {
        return value;
    }

    public Currency getOut() {
        return out;
    }

    public Calendar getDate() {
        return date;
    }

}

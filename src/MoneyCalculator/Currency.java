package MoneyCalculator;

public class Currency {
    
private final String name;
private final char symbol;
private final String country;
private final String code;

    public Currency(String name, char symbol, String country, String code) {
        this.name = name;
        this.symbol = symbol;
        this.country = country;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }

    public String getCountry() {
        return country;
    }

    public String getCode() {
        return code;
    }

        
}

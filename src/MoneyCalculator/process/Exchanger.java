
package MoneyCalculator.process;

import MoneyCalculator.model.ExchangeRate;
import MoneyCalculator.model.Money;

public class Exchanger {
    private final ExchangeRate exchangeRate;
    private final Money money;

    public Exchanger(ExchangeRate exchangeRate, Money money) {
        this.exchangeRate = exchangeRate;
        this.money = money;
    }
    
}

import java.math.BigDecimal;

public class MoneyUtil {


    public static String format(double salary, String currency) {
        if (currency == null) {
            throw new IllegalArgumentException();
        }
        if (salary < 0) {
            currency = "-" + currency;
        }
        BigDecimal money = BigDecimal.valueOf(Math.abs(salary)).setScale(2,BigDecimal.ROUND_HALF_UP);
        return currency + money;
    }


}

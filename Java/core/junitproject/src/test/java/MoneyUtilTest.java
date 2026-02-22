import org.junit.Assert;
import org.junit.Test;

public class MoneyUtilTest {

    @Test
    public void dollarTest(){
        String rounded = MoneyUtil.format(1000, "$");
        Assert.assertEquals("$1000.00", rounded);
    }

    @Test
    public void negativeDollarTest(){
        String rounded = MoneyUtil.format(-1000, "$");
        Assert.assertEquals("-$1000.00", rounded);
    }

    @Test
    public void euroTest(){
        String rounded = MoneyUtil.format(1000, "€");
        Assert.assertEquals("€1000.00", rounded);
    }

    @Test
    public void euroNegativeTest(){
        String rounded = MoneyUtil.format(-1000, "€");
        Assert.assertEquals("-€1000.00", rounded);
    }

    @Test (expected = IllegalArgumentException.class)
    public void notNullCurrencyTest(){
        String rounded = MoneyUtil.format(1000, null);
        Assert.assertEquals("€1000.00", rounded);
    }

}

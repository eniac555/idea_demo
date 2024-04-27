import org.junit.Assert;
import org.junit.Test;

/**
 * @author eniac555
 * @date 2024/4/27
 * @description:
 */
public class CalcTest {
    @Test
    public void shouldReturn2When1plus1() {
        Calc calc = new Calc();
        int actualResult = calc.compute(1, 1, "+");
        int exceptResult = 2;
        Assert.assertEquals(exceptResult, actualResult);

    }

    @Test
    public void shouldReturn0When1sub1() {
        Calc calc = new Calc();
        int actualResult = calc.compute(1, 1, "1");
        int exceptResult = 0;
        Assert.assertEquals(exceptResult, actualResult);

    }

}
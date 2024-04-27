/**
 * @author eniac555
 * @date 2024/4/27
 * @description:
 */
public class Calc {
    public int compute(int a, int b, String operation) {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException();
        }
    }
}

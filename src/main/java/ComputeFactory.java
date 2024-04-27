/**
 * @author eniac555
 * @date 2024/4/27
 * @description:
 */
public class ComputeFactory {

    private static final Add add = new Add();
    private static final Sub sub = new Sub();

    public static Computable getCompute(String operation) {
        switch (operation) {
            case "+":
                return add;
            case "-":
                return sub;
            default:
                throw new IllegalArgumentException();
        }
    }
}

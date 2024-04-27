/**
 * @author eniac555
 * @date 2024/4/27
 * @description:
 */
public class Calc {
    public int compute(int a, int b, String operation) {
        Computable computable = ComputeFactory.getCompute(operation);
        return computable.compute(a, b);
    }
}

/**
 * @author eniac555
 * @date 2024/4/27
 * @description:
 */
public class Calc {
    public int compute(int a, int b, String operation) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Computable computable = ComputeFactory.getCompute(operation);
        return computable.compute(a, b);
    }
}

package BT2;

public class TinhToanSoThuc implements ITinhToan<Double> {
    @Override
    public Double cong(Double... args) {
        double sum = 0.0;
        for (double arg : args) {
            sum += arg;
        }
        return sum;
    }

    @Override
    public Double tru(Double... args) {
        double result = args[0];
        for (int i = 1; i < args.length; i++) {
            result -= args[i];
        }
        return result;
    }

    @Override
    public Double nhan(Double... args) {
        double product = 1.0;
        for (double arg : args) {
            product *= arg;
        }
        return product;
    }

    @Override
    public Double chia(Double... args) {
        double result = args[0];
        for (int i = 1; i < args.length; i++) {
            result /= args[i];
        }
        return result;
    }
}
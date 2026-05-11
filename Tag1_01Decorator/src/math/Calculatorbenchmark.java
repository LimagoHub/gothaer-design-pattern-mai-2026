package math;

import java.time.Duration;
import java.time.Instant;

public class Calculatorbenchmark implements Calculator {

    private  Calculator calculator;
    public Calculatorbenchmark(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public double add(final double a, final double b) {
        Instant start = Instant.now();
        double result =  calculator.add(a, b);
        Instant end = Instant.now();
        Duration duration = Duration.between(start, end);
        System.out.println("Duration: " + duration.toMillis());
        return result;
    }

    @Override
    public double sub(final double a, final double b) {
        return calculator.sub(a, b);
    }
}

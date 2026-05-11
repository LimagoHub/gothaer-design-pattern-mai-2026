package de.limago.springcalculator.runner;

import de.limago.springcalculator.math.Calculator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final Calculator calculator;

    public MyRunner(final Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(calculator.add(1, 2));
    }
}

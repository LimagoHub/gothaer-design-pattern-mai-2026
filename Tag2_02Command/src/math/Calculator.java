package math;

public class Calculator {
    private static final Calculator INSTANCE = new Calculator();

    private double memory = 0.0;
    private Calculator() {}

    public double getMemory() {
        return memory;
    }

    private void setMemory(final double memory) {
        this.memory = memory;
    }

    public static Calculator getInstance() {
        return INSTANCE;
    }

    public void add(double value) {
        memory += value;
    }

    public void sub(double value) {
        memory -= value;
    }
    public void mult(double value) {
        memory *= value;
    }

    public void div(double value) {
        memory /= value;
    }

    public void clear() {
        memory = 0.0;
    }

    public void print() {
        System.out.println(memory);
    }

    public CalculatorMemento getMemento() {
        return new MyCalculatorMemento(memory);
    }

    public void setMemento(final CalculatorMemento memento) {
        memory = ((MyCalculatorMemento)memento).getMemory();
    }

    private static class MyCalculatorMemento implements CalculatorMemento {
        private final double memory;

        public MyCalculatorMemento(final double memory) {
            this.memory = memory;
        }

        public double getMemory() {
            return memory;
        }
    }

}

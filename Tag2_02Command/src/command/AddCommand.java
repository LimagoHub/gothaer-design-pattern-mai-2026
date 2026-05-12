package command;

import math.Calculator;
import math.CalculatorMemento;

public class AddCommand extends AbstractTransactionCommand {

    private CalculatorMemento memento;
    private double value;

    @Override
    public void parse(final String[] tokens) {
        value = Double.parseDouble(tokens[1]);
    }

       @Override
    protected void doAction() {
        Calculator.getInstance().add(value);
    }


}

package command;

import math.Calculator;

public class SubCommand extends AbstractTransactionCommand{

    private double value;

    @Override
    protected void doAction() {
        Calculator.getInstance().sub(value);
    }

    @Override
    public void parse(final String[] tokens) {
        value = Double.parseDouble(tokens[1]);
    }
}

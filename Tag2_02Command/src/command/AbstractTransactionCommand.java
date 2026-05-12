package command;

import math.Calculator;
import math.CalculatorMemento;

public abstract class AbstractTransactionCommand implements Command {

    private CalculatorMemento memento;

    @Override
    public void parse(final String[] tokens) {
        // Nop
    }

    @Override
    public final void execute() {
        memento = Calculator.getInstance().getMemento();
        doAction();
    }

    protected abstract void doAction() ;

    @Override
    public void undo() {
        Calculator.getInstance().setMemento(memento);
    }

    @Override
    public boolean isQuery() {
        return false;
    }
}

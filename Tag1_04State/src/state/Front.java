package state;

public class Front {

    protected final State stateA = new StateA(this);
    protected final State stateB = new StateB(this);
    protected State currentState = stateA;

    public void changeToA() {
        currentState.changeToA();
    }

    public void changeToB() {
        currentState.changeToB();
    }

    public void drucken() {
        currentState.drucken();
    }
}

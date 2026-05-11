package state;

public class StateB extends AbstractState {

    public StateB(final Front front) {
        super(front);
    }

    @Override
    public void changeToA() {
        getFront().currentState = getFront().stateA;
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt B");
    }
}

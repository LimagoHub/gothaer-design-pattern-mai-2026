package state;

public class StateA extends AbstractState {

    public StateA(final Front front) {
        super(front);
    }

    @Override
    public void changeToB() {
        getFront().currentState = getFront().stateB;
    }

    @Override
    public void drucken() {
        System.out.println("Hier druckt A");
    }
}

package state;

public abstract class AbstractState implements State {

    private final Front front;

    public AbstractState(final Front front) {
        this.front = front;
    }


    public final Front getFront() {
        return front;
    }

    @Override
    public void changeToA() {
        throw new IllegalStateException("Diese Methode ist in diesem State nicht erlaubt");
    }

    @Override
    public void changeToB() {
        throw new IllegalStateException("Diese Methode ist in diesem State nicht erlaubt");
    }

    @Override
    public void drucken() {
        throw new IllegalStateException("Diese Methode ist in diesem State nicht erlaubt");
    }
}

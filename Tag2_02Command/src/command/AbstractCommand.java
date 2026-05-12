package command;

public abstract class AbstractCommand implements Command {
    @Override
    public void parse(final String[] tokens) {
        // Nop
    }



    @Override
    public void undo() {
        throw new UnsupportedOperationException("Ist doch eine Query");
    }

    @Override
    public boolean isQuery() {
        return true;
    }
}

package processor;

public class CharacterCounter extends FileProcessor{

    private int counter;

    @Override
    public void init() {
        counter = 0;
    }

    @Override
    public void dipose() {
        System.out.println(counter);
    }

    @Override
    public void process(final char c) {
        counter++;
    }
}

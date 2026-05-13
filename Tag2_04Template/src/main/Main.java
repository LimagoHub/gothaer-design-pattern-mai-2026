package main;

import processor.CharacterCounter;
import processor.FileProcessor;
import processor.LineCounter;

public class Main {

    public static void main(String[] args) {

        FileProcessor fp = new FileProcessor();
        fp.addHandler(new CharacterCounter());
        fp.addHandler(new LineCounter());
        fp.run("./src/resources/eingabe.txt");
    }
}

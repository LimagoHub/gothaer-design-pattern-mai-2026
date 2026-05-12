package main;

import processor.CharacterCounter;
import processor.FileProcessor;
import processor.LineCounter;

public class Main {

    public static void main(String[] args) {

        FileProcessor fp = new LineCounter();
        fp.run("./src/resources/eingabe.txt");
    }
}

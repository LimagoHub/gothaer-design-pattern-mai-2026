package main;

import tiere.Schwein;
import tiere.SchweineMemento;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Schwein schwein = new Schwein("Piggy");
        System.out.println(schwein);

        SchweineMemento m = schwein.getMemento();
        schwein.fuettern();
        System.out.println(schwein);
        
        schwein.setMemento(m);
        System.out.println(schwein);
    }
}

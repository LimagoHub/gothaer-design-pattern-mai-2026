package main;

import tiere.PigTooFatListener;
import tiere.Schwein;
import tiere.Tier;

public class Main {

    private Metzger metzger = new Metzger();
    private Spediteur spediteur = new Spediteur();
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Schwein piggy = new Schwein("Miss Piggy");
        piggy.addPigTooFatListerner(new SchweineMetzgerAdapter());
        piggy.addPigTooFatListerner(s->spediteur.fahren(s));
        piggy.addPigTooFatListerner(spediteur::fahren);
        for (int i = 0; i < 11; i++) {
            piggy.fuettern();
        }
    }

    class SchweineMetzgerAdapter implements PigTooFatListener {

        @Override
        public void pigTooFat(final Schwein dickesSchwein) {
            metzger.schlachten(dickesSchwein);
        }
    }
}

class Metzger  {


    public void schlachten(final Tier armesTier) {
        System.out.println("Messer wetz");
    }
}

class Spediteur {
    public void fahren(final Object ware) {
        System.out.println("Wir fahren auf der Autobahn");
    }
}

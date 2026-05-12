package tiere;

import java.util.ArrayList;
import java.util.List;

public class Schwein extends Tier{

    private static final int MAX_WEIGHT = 20;
    private final List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();

    private String name;
    private int gewicht;

    public Schwein(final String name) {
        this.name = name;
        this.gewicht = 10;
    }

    public void addPigTooFatListerner(final PigTooFatListener listener) {
        pigTooFatListeners.add(listener);
    }


    public void removePigTooFatListerner(final PigTooFatListener listener) {
        pigTooFatListeners.remove(listener);
    }


    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach((listener) -> {listener.pigTooFat(this);});
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        this.gewicht = gewicht;
        if(gewicht > MAX_WEIGHT) {firePigTooFatEvent();}
    }

    public void fuettern() {
        setGewicht(getGewicht() + 1);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Schwein{");
        sb.append("name='").append(name).append('\'');
        sb.append(", gewicht=").append(gewicht);
        sb.append('}');
        return sb.toString();
    }
}

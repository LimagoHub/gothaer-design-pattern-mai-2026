package tiere;

import event.PropertyChangedEvent;
import event.PropertyChangedListener;

import java.util.ArrayList;
import java.util.List;

public class Schwein extends Tier{

    private static final int MAX_WEIGHT = 20;
    private final List<PigTooFatListener> pigTooFatListeners = new ArrayList<>();
    private final List<PropertyChangedListener> propertyChangedListeners = new ArrayList<>();
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

    public void addPropertyChangedListener(final PropertyChangedListener listener) {
        propertyChangedListeners.add(listener);
    }

    public void removePropertyChangedListener(final PropertyChangedListener listener) {
        propertyChangedListeners.remove(listener);
    }



    public String getName() {
        return name;
    }

    public void setName(final String name) {
        if(this.name == name) return;
        firePropertyChangedEvent("name",this.name, this.name = name);

    }

    public int getGewicht() {
        return gewicht;
    }

    private void setGewicht(final int gewicht) {
        if(this.gewicht == gewicht  ) return;
        firePropertyChangedEvent("gewicht",this.gewicht, this.gewicht = gewicht);
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


    private void firePigTooFatEvent() {
        pigTooFatListeners.forEach((listener) -> {listener.pigTooFat(this);});
    }

    private void firePropertyChangedEvent(final PropertyChangedEvent event) {
        propertyChangedListeners.forEach(propertyChangedListener -> propertyChangedListener.propertyChanged(event)   );
    }

    private void firePropertyChangedEvent(String propertyName, Object oldValue, Object newValue) {
        firePropertyChangedEvent(new PropertyChangedEvent(this, propertyName, oldValue, newValue));
    }
}

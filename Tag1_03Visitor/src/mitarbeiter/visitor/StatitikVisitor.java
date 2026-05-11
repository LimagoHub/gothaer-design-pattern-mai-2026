package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class StatitikVisitor implements MitarbeiterVisitor {

    private int gehaltsempfaengerCounter;
    private int lohnempfaengerCounter;


    public int getGehaltsempfaengerCounter() {
        return gehaltsempfaengerCounter;
    }

    public int getLohnempfaengerCounter() {
        return lohnempfaengerCounter;
    }

    public int getTotalCounter() {
        return lohnempfaengerCounter + gehaltsempfaengerCounter;
    }

    @Override
    public void init() {
        lohnempfaengerCounter  = gehaltsempfaengerCounter = 0;
    }

    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        lohnempfaengerCounter++;
    }

    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        gehaltsempfaengerCounter++;
    }

    @Override
    public void dispose() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StatitikVisitor{");
        sb.append("gehaltsempfaengerCounter=").append(gehaltsempfaengerCounter);
        sb.append(", lohnempfaengerCounter=").append(lohnempfaengerCounter);
        sb.append(", totalCounter=").append(getTotalCounter());
        sb.append('}');
        return sb.toString();
    }
}

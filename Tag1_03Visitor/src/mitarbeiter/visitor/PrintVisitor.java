package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public class PrintVisitor implements MitarbeiterVisitor{
    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        System.out.println(lohnempfaenger);
    }

    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        System.out.println(gehaltsempfaenger);
    }
}

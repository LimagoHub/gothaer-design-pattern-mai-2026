package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public abstract class AbstractMitarbeiterVisitor implements MitarbeiterVisitor {
    @Override
    public void visit(final Lohnempfaenger lohnempfaenger) {
        // Nop
    }

    @Override
    public void visit(final Gehaltsempfaenger gehaltsempfaenger) {
        // Nop
    }

    @Override
    public void init() {
        // nop
    }

    @Override
    public void dispose() {
        //NOP
    }
}

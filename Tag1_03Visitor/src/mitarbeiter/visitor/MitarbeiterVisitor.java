package mitarbeiter.visitor;

import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;

public interface MitarbeiterVisitor {
    void init();
    void visit(Lohnempfaenger lohnempfaenger);
    void visit(Gehaltsempfaenger gehaltsempfaenger);
    void dispose();
}

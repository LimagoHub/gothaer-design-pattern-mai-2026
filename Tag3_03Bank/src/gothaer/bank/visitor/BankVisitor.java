package gothaer.bank.visitor;

import gothaer.bank.Konto;
import gothaer.bank.Kontogruppe;

public interface BankVisitor {
    void init();
    void dispose();
    void visit(Kontogruppe kontogruppe);
    void visit(Konto konto);
}

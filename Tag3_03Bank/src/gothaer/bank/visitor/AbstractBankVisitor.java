package gothaer.bank.visitor;

import gothaer.bank.Konto;
import gothaer.bank.Kontogruppe;

public class AbstractBankVisitor implements BankVisitor {


    @Override
    public void init() {
        // Nop
    }

    @Override
    public void dispose() {
        // Nop
    }

    @Override
    public void visit(final Kontogruppe kontogruppe) {
        // Nop
    }

    @Override
    public void visit(final Konto konto) {
        // Nop
    }
}

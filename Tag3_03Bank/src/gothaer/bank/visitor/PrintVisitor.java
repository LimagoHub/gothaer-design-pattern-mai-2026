package gothaer.bank.visitor;

import gothaer.bank.Konto;
import gothaer.bank.Kontogruppe;

public class PrintVisitor extends AbstractBankVisitor{

    @Override
    public void visit(final Kontogruppe kontogruppe) {
        System.out.println(kontogruppe);
    }

    @Override
    public void visit(final Konto konto) {
        System.out.println(konto);
    }
}

package gothaer.bank;

import gothaer.bank.visitor.BankVisitor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kontogruppe extends AbstractBankNode {

    private final List<AbstractBankNode> children = new ArrayList<>();

    public Kontogruppe(final String label) {
        super(label);
    }

    @Override
    public List<AbstractBankNode> getChildren() {
        return Collections.unmodifiableList(children);
    }

    public void appendChild(final AbstractBankNode child) {
        child.setParent(this);
        children.add(child);
    }
    public void accept(BankVisitor visitor){
        visitor.visit(this);
    }
}

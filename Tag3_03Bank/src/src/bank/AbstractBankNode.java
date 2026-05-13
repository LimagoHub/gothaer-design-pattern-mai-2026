package src.bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AbstractBankNode implements Iterable<AbstractBankNode> {

    private AbstractBankNode parent =  null;
    private String label;

    public AbstractBankNode(String label) {
        this.label = label;
    }

    public AbstractBankNode getParent() {
        return parent;
    }

    public void setParent(final AbstractBankNode parent) {
        this.parent = parent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public List<AbstractBankNode> getChildren() {
        return Collections.emptyList();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName()+"{");

        sb.append(", label='").append(label).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void print() {
        System.out.println(this);
        for(AbstractBankNode node : getChildren()) {
            node.print();
        }
    }

    @Override
    public Iterator<AbstractBankNode> iterator() {
        List<AbstractBankNode> list = new ArrayList<>();
        fillIteratorListe(list);
        return list.iterator();
    }

    private void fillIteratorListe(final List<AbstractBankNode> list) {
        list.add(this);
        for(AbstractBankNode child : getChildren()) {
            child.fillIteratorListe(list);
        }
    }

}

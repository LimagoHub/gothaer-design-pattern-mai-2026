package gothaer.main;


import gothaer.bank.AbstractBankNode;
import gothaer.bank.Konto;
import gothaer.bank.Kontogruppe;
import gothaer.bank.visitor.PrintVisitor;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        // Kontogruppe statt Kontogruppe
        Kontogruppe root = new Kontogruppe("root");

        Kontogruppe e1_1 = new Kontogruppe("e1_1");
        root.appendChild(e1_1);

        Kontogruppe e1_2 = new Kontogruppe("e1_2");
        root.appendChild(e1_2);

        Kontogruppe e2_1 = new Kontogruppe("e2_1");
        e1_1.appendChild(e2_1);

        // Konto statt zusaetzlich saldo
        Konto e2_2 = new Konto("e2_2",5);
        e1_1.appendChild(e2_2);


        Konto e2_3 = new Konto("e2_3",10);
        e1_2.appendChild(e2_3);
        Konto e2_4 = new Konto("e2_4",100);
        e1_2.appendChild(e2_4);

        /*for(AbstractBankNode node : root) {
            System.out.println(node);
        }

        Iterator<AbstractBankNode> iterator = root.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        */
        root.iterate(new PrintVisitor());

    }


}

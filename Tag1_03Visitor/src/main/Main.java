package main;

import firma.Firma;
import mitarbeiter.Gehaltsempfaenger;
import mitarbeiter.Lohnempfaenger;
import mitarbeiter.visitor.PrintVisitor;

public class Main {

    public static void main(String[] args) {
        Firma firma = new Firma();

        firma.add(new Lohnempfaenger("Schmitt", 20,30));
        firma.add(new Lohnempfaenger("Schulz", 15,40));
        firma.add(new Gehaltsempfaenger("Hinz", 2500));
        firma.add(new Gehaltsempfaenger("Kunz", 4000));
        firma.add(new Lohnempfaenger("Maier", 15,40));

        //firma.print();
        firma.iterate(new PrintVisitor());
    }
}

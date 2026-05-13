package main;

import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = List.of("eins", "zwei", "drei", "vier");

        for (int i = 0; i < liste.size() ; i++) {
            System.out.println(liste.get(i));
        }

        System.out.println("-".repeat(30));

        for(String s: liste) {
            System.out.println(s);
        }

        System.out.println("-".repeat(30));

        liste.forEach(System.out::println);

        System.out.println("-".repeat(30));

        Iterator<String> iterator = liste.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

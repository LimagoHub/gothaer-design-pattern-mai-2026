package main;

import flyweight.AttributedCharacter;

public class Main {

    public static void main(String[] args) {
        AttributedCharacter a1 = AttributedCharacter.createInstance('A', false);
        AttributedCharacter a2 = AttributedCharacter.createInstance('A', false);
        AttributedCharacter a3 = AttributedCharacter.createInstance('A', true);

        System.out.println(a1 == a2);
        System.out.println(a1 == a3);
    }
}

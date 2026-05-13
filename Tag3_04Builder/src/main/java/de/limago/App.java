package de.limago;


import de.limago.pojo.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Person p = Person.builder().anrede("Divers").vorname("Max").nachname("Mustermann").build();

        System.out.println( "Hello World!" );
    }
}

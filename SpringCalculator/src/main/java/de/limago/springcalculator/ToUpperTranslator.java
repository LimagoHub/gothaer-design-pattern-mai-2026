package de.limago.springcalculator;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("upper")
public class ToUpperTranslator implements Translator {
    @Override
    public String translate(final String input) {
        return input.toUpperCase();
    }
}

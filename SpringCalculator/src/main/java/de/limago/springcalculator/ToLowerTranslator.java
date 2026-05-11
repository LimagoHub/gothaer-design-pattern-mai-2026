package de.limago.springcalculator;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lower")
public class ToLowerTranslator implements Translator {
    @Override
    public String translate(String input) {
        return input.toLowerCase();
    }
}

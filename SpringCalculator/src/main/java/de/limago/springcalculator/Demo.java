package de.limago.springcalculator;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Demo {


    private final Translator translator;


    @Autowired
    public Demo(@Qualifier("lower") Translator translator) {
        this.translator = translator;
        System.out.println(translator.translate("Demo Constructor"));
    }

    @PostConstruct
    public void init() {
        System.out.println(translator.translate("Init"));
    }

}

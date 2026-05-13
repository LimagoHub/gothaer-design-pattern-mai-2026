package de.limago.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person {

    private String anrede;

    @Builder.Default private String vorname = "Fritz";
    private String nachname;
    private String email;
    private String ort;



}

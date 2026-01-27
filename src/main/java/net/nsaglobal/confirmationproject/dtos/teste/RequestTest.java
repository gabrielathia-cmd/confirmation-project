package net.nsaglobal.confirmationproject.dtos.teste;

import lombok.Getter;
import lombok.Setter;

public class RequestTest {

//Attributes

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private double value;

//Constructor

    public RequestTest() {}

    public RequestTest(String name, String description, double value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public RequestTest(String name, double value) {
        this.name = name;
        this.description = null;
        this.value = value;
    }
}

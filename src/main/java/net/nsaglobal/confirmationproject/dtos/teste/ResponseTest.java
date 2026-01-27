package net.nsaglobal.confirmationproject.dtos.teste;

import lombok.Getter;
import lombok.Setter;

public class ResponseTest {

//Attributes

    @Getter
    @Setter
    private long id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private double value;

//Constructors

    public ResponseTest() {}

    public ResponseTest(long id, String name, String description, double value) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public ResponseTest(long id, String name, double value) {
        this.id = id;
        this.name = name;
        this.description = null;
        this.value = value;
    }
}
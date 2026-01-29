package net.nsaglobal.confirmationproject.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "table_test")
public class EntidadeTeste {

//Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Getter
    @Setter
    @Column(name = "name", nullable = false)
    private String name;

    @Getter
    @Setter
    @Column(name = "description")
    private String description;

    @Getter
    @Setter
    @Column(name= "value", nullable = false, scale = 2)
    private double value;

//Constructors

    public EntidadeTeste() {}

    public EntidadeTeste(String name, String description, double value) {
        this.name = name;
        this.description = description;
        this.value = value;
    }

    public EntidadeTeste(String name, double value) {
        this.name = name;
        this.description = null;
        this.value = value;
    }

//Methods

    public void doubleValue() {
        this.value = this.value * 2;
    }
}

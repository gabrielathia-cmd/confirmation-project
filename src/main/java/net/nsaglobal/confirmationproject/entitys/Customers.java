package net.nsaglobal.confirmationproject.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "customers_table")
abstract public class Customers {

//Attributes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    private long id;

    @Getter
    @Setter
    @Column(name = "customer_name", nullable = false)
    private String customerName;
}
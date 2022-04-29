package fr.vincent.testRest.model;

//Import Lombok Generator
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

//Using Lombok generators
@Getter
@Setter
@NoArgsConstructor

//Model Supplier
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "address_seq")
    @SequenceGenerator(name= "address_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String street;
    private String number;
    private String town;
    private String postalCode;
    private String country;
}

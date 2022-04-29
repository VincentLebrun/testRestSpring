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

//Model Products
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "storage_seq")
    @SequenceGenerator(name= "storage_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String name;
    private float price;
    private float tva;
    private float length;
    private float width;
    private float weight;


}

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
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supplier_seq")
    @SequenceGenerator(name= "supplier_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String name;
    private String tel;
    private String email;
}

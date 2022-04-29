package fr.vincent.testRest.model;

//Import Lombok Generator
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

//Using Lombok generators
@Getter
@Setter
@NoArgsConstructor

//Model Products
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @SequenceGenerator(name= "brand_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String name;
    //Mémo une marque à plusieurs produits donc OneTomany
    @OneToMany
    private List<Products> products;
}

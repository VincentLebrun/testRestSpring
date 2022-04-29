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
@Entity
//Model Products
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "brand_seq")
    @SequenceGenerator(name= "brand_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    private String name;
    //Mémo une marque à plusieurs produits donc OneTomany et le maped by te permet de lier
    //Sans le mappedBy tu as l'erreur
    @OneToMany(mappedBy = "brand")
    private List<Products> products;
}

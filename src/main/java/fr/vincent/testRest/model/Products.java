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
// Plusieurs Produits ont une seule marque
    @ManyToOne
    private Brand brand;

    /**Mémo tu peux utiliser les produit si la 2 ème cardinalité est un many
     * donc dans l'autre entitée le premier sera many
     *une petite astuce xTox et tu remplis
     *
      **/

    @ManyToMany
    private List <Storage> storages;

}

package fr.vincent.testRest.controller;

//imports model
import fr.vincent.testRest.model.Products;
//Import repo
import fr.vincent.testRest.repository.ProductsRepository;
//import tool
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsController {

    private final ProductsRepository repository;
     // à la place d'autowired
    public ProductsController(ProductsRepository repository) {
        this.repository = repository;
    }
    //Nomenclature pour écrire du post en rest
    @PostMapping("/products")
    Products createNewProducts(@RequestBody Products newProducts ) {
        return repository.save(newProducts);
    }

}

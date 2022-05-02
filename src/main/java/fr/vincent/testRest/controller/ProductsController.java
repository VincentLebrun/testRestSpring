package fr.vincent.testRest.controller;
//imports model
import fr.vincent.testRest.model.Products;
//Import repo
import fr.vincent.testRest.repository.ProductsRepository;
//import tool srping
import fr.vincent.testRest.service.ProductsService;
//imports tool Spring Rest
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductsController {
    private final ProductsRepository repository;
    private final ProductsService service;
    // à la place d'autowired
    public ProductsController(ProductsRepository repository, ProductsService service) {
        this.repository = repository;
        this.service = service;
    }

    //Nomenclature pour écrire du post en rest
    @PostMapping("/products")
    Products createNewProducts(@RequestBody Products newProducts) {
        return repository.save(newProducts);
    }

    //GetRequest to products
    @GetMapping("/products")
   List<Products>  FindProducts() {
        return  service.getAll();
    }
}

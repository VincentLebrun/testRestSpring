package fr.vincent.testRest.controller;
//imports model

import fr.vincent.testRest.model.Products;
//Import repo
import fr.vincent.testRest.repository.ProductsRepository;
//import tool srping
import fr.vincent.testRest.service.ProductsService;
//imports tool Spring Rest
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {
    private final ProductsRepository productRepository;
    private final ProductsService productService;

    // à la place d'autowired
    public ProductsController(ProductsRepository repository, ProductsService service) {
        this.productRepository = repository;
        this.productService = service;
    }

    //Nomenclature pour écrire du post en rest
    @PostMapping("/products")
    Products createNewProducts(@RequestBody Products newProducts) {
        return productRepository.save(newProducts);
    }

    //GetRequest to products
    @GetMapping("/products")
    List<Products> FindProducts() {
        return productService.getAll();
    }

    @PutMapping("/updateProducts")
    public Products updateProduct(Model model, @RequestBody Products product) {
        System.out.println(product);
        Products product1 = productService.getById(product.getId());
        model.addAttribute("product", product);

        return productRepository.save(product);

    }


}

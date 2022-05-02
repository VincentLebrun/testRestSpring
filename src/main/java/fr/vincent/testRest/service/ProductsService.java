package fr.vincent.testRest.service;

import fr.vincent.testRest.model.Products;
import fr.vincent.testRest.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductsRepository productsRepository;
    public List<Products> getAll() {
        return productsRepository.findAll();
    }


}

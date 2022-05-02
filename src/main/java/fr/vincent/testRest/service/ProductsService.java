package fr.vincent.testRest.service;

//Import Model

import fr.vincent.testRest.model.Products;
//Import repo
import fr.vincent.testRest.repository.ProductsRepository;
//Imports tools
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsService {
    private final ProductsRepository productsRepository;

    //Method to return all elements of products
    public List<Products> getAll() {
        return productsRepository.findAll();
    }

    public Products getById(Long id) {
        return productsRepository.findOneById(id);
    }

    public Products update(Products product) {
        /** pour update un paramètre il faut récupérer
         * tout les champs à manimuler avec les getters Setters
         */
        Products temp = getById(product.getId());
        temp.setLength(product.getLength());
        temp.setName(product.getName());
        temp.setPrice(product.getPrice());
        temp.setTva(product.getTva());
        temp.setWeight(product.getWeight());
        temp.setWidth(product.getWidth());
        return temp;
    }

}

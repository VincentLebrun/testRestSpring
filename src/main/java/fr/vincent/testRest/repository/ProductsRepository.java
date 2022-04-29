package fr.vincent.testRest.repository;

import fr.vincent.testRest.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}

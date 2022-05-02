package fr.vincent.testRest.repository;

import fr.vincent.testRest.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    @Query(nativeQuery = true , value = "SELECT * FROM products")
    public List<Products> findAll();


}

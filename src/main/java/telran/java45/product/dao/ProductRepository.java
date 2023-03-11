package telran.java45.product.dao;

import org.springframework.data.repository.CrudRepository;

import telran.java45.product.model.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {

}

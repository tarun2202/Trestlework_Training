package tech.trestlework.productservice;

import org.springframework.data.mongodb.repository.MongoRepository;
import tech.trestlework.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}

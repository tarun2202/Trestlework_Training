package tech.trestlework.productservice.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tech.trestlework.productservice.ProductRepository;
import tech.trestlework.productservice.dto.ProductRequest;
import tech.trestlework.productservice.dto.ProductResponse;
import tech.trestlework.productservice.model.Product;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {

    //constructor based dependency injection--> for this purpose we are leveraging @RequiredArgsConstructor
    private final ProductRepository productRepository;

//    public ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

    public void createProduct(ProductRequest productRequest) {
        Product product = Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();

        productRepository.save(product);

        //using the placeholder to display the product id: feature of slf4j
        // at runtime, it will dynamically get the value and then displayed it.
        log.info("Product {} is saved", product.getId());
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();

        //mapping the Product class products into the ProductResponse class object.
        return products.stream().map(this::mapToProductResponse).toList();
    }

    private ProductResponse mapToProductResponse(Product product) {
        return ProductResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .description(product.getDescription())
                .price(product.getPrice())
                .build();
    }
}

package com.example.ing.data.dao.impl;

import com.example.ing.data.entity.Product;
import com.example.ing.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

// DAD-클래스는 '인터페이스-구현체'구성으로 생성함
public class ProductImpl implements ProductDAO{
    private ProductRepository productRepository;

    @Autowired
    public ProductDAOImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

  
    @Override
    public Product insertProduct(Product product) {
        Product savedProduct = productRepository.save(product);

        return savedProduct;
    }


    @Override
    public Product selectProduct(Long number) {
        Product selectedProduct = productRepository.getById(number);

        return selectedProduct;
    }


    @Override
    public Product updateProductName(Long number, String name) throws Exception {
        Optional<Product> selectedProduct = productRepository.findById(number);

        Product updatedProduct;
        if (selectedProduct.isPresent()) {
            Product product = selectedProduct.get();

            product.setName(name);
            product.setUpdatedAt(LocalDateTime.now());

            updatedProduct = productRepository.save(product);
        } else {
            throw new Exception();
        }

        return updatedProduct;
    }


    @Override
    public void deleteProduct(Long number) throws Exception {
        Optional<Product> selectedProduct = productRepository.findById(number);

        if (selectedProduct.isPresent()) {
            Product product = selectedProduct.get();

            productRepository.delete(product);
        } else {
            throw new Exception();
        }
    }
}

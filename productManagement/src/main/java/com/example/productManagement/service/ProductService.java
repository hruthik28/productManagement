package com.example.productManagement.service;

import com.example.productManagement.dto.ProductDTO;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<ProductDTO> getAllProducts();

    Optional<ProductDTO> getProductById(Long id);

    ProductDTO createProduct(ProductDTO productDTO);

    Optional<ProductDTO> updateProduct(Long id, ProductDTO productDTO);

    boolean deleteProduct(Long id);
}

package com.example.product.controllers;

import com.example.product.dtos.ProductRequestDto;
import com.example.product.models.Product;
import com.example.product.services.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProductService productService ;
    // Get all the products
    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return productService.getAllProducts() ;
    }

    // Get a product with id
    @GetMapping ("/products/{id}")
    public Product getSingleProoduct(@PathVariable("id") Long id ){
        return productService.getSingleProduct(id);
    }

    @PostMapping("/products")
    public Product addProduct(@RequestBody ProductRequestDto productRequestDto){
        return productService.addProduct(productRequestDto);
    }

    // update a product
    @PutMapping("/products/{id}")
    public Product updateProduct(@PathVariable("id") Long id ,
                                 @RequestBody ProductRequestDto productRequestDto){
        return  productService.updateProduct(id,productRequestDto);
    }

    // Delete a product
    @DeleteMapping("/products/{id}")
    public boolean deleteProduct(@PathVariable("id") Long id){
        return true ;
    }

}

package com.example.product.services;

import com.example.product.dtos.ProductRequestDto;
import com.example.product.dtos.ProductResponseDto;
import com.example.product.models.Categery;
import com.example.product.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class FakeStoreProductService implements IProductService{
    @Autowired
    RestTemplate restTemplate ;

    // I should pass this 'id' to fakestore and get the details of this product.
    // "https://fakestoreapi.com/products/1"
    @Override
    public Product getSingleProduct(Long id) {
        ProductResponseDto response = restTemplate.getForObject("https://fakestoreapi.com/products/"+id,
                ProductResponseDto.class);
        return getProductFromResponseDto(response) ;

    }

    @Override
    public List<Product> getAllProducts() {
        ProductResponseDto[] responseDtoList =
                restTemplate.getForObject("https://fakestoreapi.com/products",
                                ProductResponseDto[].class);

        List<Product> products = new ArrayList<>() ;
          for (ProductResponseDto productResponseDto : responseDtoList){
              products.add(getProductFromResponseDto(productResponseDto));
          }
          return products ;
    }

    @Override
    public Product addProduct(ProductRequestDto productRequestDto) {
        ProductResponseDto productResponseDto = restTemplate.postForObject(
                "https://fakestoreapi.com/products" ,
                productRequestDto,ProductResponseDto.class
              ) ;

        Product product = getProductFromResponseDto(productResponseDto) ;
        return product ;
    }

    @Override
    public Product updateProduct(Long id, ProductRequestDto productRequestDto) {
        return null;
    }

    private Product getProductFromResponseDto(ProductResponseDto response) {
        Product product = new Product() ;
        product.setId(response.getId());
        product.setName(response.getTitle());
        product.setPrice(response.getPrice());
        product.setDescription(response.getDescription());
        product.setImage(response.getImage());

        Categery categery = new Categery() ;
        categery.setName(response.getCategory());

        product.setCategery(categery);
        return product ;
    }
}

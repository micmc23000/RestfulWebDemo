/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.micmc23000.productdemo.services;

import com.github.micmc23000.productdemo.entityclasses.Product;
import com.github.micmc23000.productdemo.repositories.ProductRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Michael
 */
@Service
public class ProductService {
    
    @Autowired
    ProductRepository productRepository;
    
    public List<Product> getAllProducts() {
        return productRepository.getAllProducts();
    }// end getAllProducts

    
    public boolean addAProduct(Product p) {
        if(isProductNameUnique(p))
        {
        return productRepository.addAProduct(p);
        }
        else
            return false;
    }
    
    public void deleteAProduct(String code) {
       productRepository.deleteAProduct(code);
    }//end deleteAProduct

    private boolean isProductNameUnique(Product p) {
        return true;
    }

}//end class ProductService
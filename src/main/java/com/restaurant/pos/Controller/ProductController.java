package com.restaurant.pos.Controller;

import com.restaurant.pos.Model.Product;
import com.restaurant.pos.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/getById/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable("id") Integer id){
        Optional<Product> category=productRepository.findById(id);
        return new ResponseEntity<>(category.get(), HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Product>> getAllProduct(){
        try {
            return new ResponseEntity<>(productRepository.findAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/save")
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        try {
            return  new ResponseEntity<>(productRepository.save(product),HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable("id") int id,@RequestBody Product product){
        try {
            Product productExist=productRepository.findById(id).get();
            productExist.setDescription(product.getDescription());
            return  new ResponseEntity<>(productRepository.save(productExist),HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable("id") Integer id){
        productRepository.deleteById(id);
        return new ResponseEntity<>("Successfully deleted !",HttpStatus.OK);
    }
}

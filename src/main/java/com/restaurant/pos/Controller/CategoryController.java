package com.restaurant.pos.Controller;

import com.restaurant.pos.Model.Category;
import com.restaurant.pos.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryRepository categoryRepository;

    @GetMapping("/getById/{id}")
    public ResponseEntity<Category> getCategoryById(@PathVariable("id") Integer id){
        Optional<Category> category=categoryRepository.findById(id);
        return new ResponseEntity<>(category.get(),HttpStatus.OK);
    }
    @GetMapping("/all")
    public ResponseEntity<List<Category>> getAllCategory(){
        try {
            return new ResponseEntity<>(categoryRepository.findAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @PostMapping("/save")
    public ResponseEntity<Category> createCategory(@RequestBody Category category){
        try {
            return  new ResponseEntity<>(categoryRepository.save(category),HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable("id") int id,@RequestBody Category category){
        try {
            Category catExist=categoryRepository.findById(id).get();
            catExist.setDescription(category.getDescription());
            return  new ResponseEntity<>(categoryRepository.save(catExist),HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Integer id){
        categoryRepository.deleteById(id);
        return new ResponseEntity<>("Successfully deleted !",HttpStatus.OK);
    }


}

package com.restaurant.pos.Controller;

import com.restaurant.pos.Model.Category;
import com.restaurant.pos.Model.Subcategory;
import com.restaurant.pos.Repository.SubCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/api/sub-category")
@RestController
public class SubCategoryController {

    @Autowired
    SubCategoryRepository subCategoryRepository;

    @PostMapping("/save")
    public ResponseEntity<Subcategory> createSubCategory(@RequestBody Subcategory subcategory){
        try {
            return  new ResponseEntity<>(subCategoryRepository.save(subcategory), HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/all")
    public ResponseEntity<List<Subcategory>> getAllSubCategory(){
        try {
            return new ResponseEntity<>(subCategoryRepository.findAll(),HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }

    @GetMapping("/getById/{id}")
    public ResponseEntity<Subcategory> getSubCategoryById(@PathVariable("id") Integer id){
        Optional<Subcategory> subcategory=subCategoryRepository.findById(id);
        return new ResponseEntity<>(subcategory.get(),HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Subcategory> updateSubCategory(@PathVariable("id") int id, @RequestBody Subcategory subcategory){
        try {
            Subcategory catExist=subCategoryRepository.findById(id).get();
            catExist.setSubCategory(subcategory.getSubCategory());
            return  new ResponseEntity<>(subCategoryRepository.save(catExist),HttpStatus.CREATED);
        }catch (Exception e){
            return  new ResponseEntity<>(null,HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Integer id){
        subCategoryRepository.deleteById(id);
        return new ResponseEntity<>("Successfully deleted !",HttpStatus.OK);
    }
}

package com.restaurant.pos.Repository;

import com.restaurant.pos.Model.Subcategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoryRepository extends JpaRepository<Subcategory,Integer> {
}

package com.restaurant.pos.Model;

import javax.persistence.*;

@Entity
@Table(name="subcategory")
public class Subcategory {
    public Subcategory() {
    }

    public Subcategory(int id, String subCategory, String category_id) {
        this.id = id;
        this.subCategory = subCategory;
        this.category_id = category_id;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="subcat")
    private String subCategory;

    @Column(name="cat_id")
    private String category_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }

    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    @Override
    public String toString() {
        return "Subcategory{" +
                "id=" + id +
                ", subCategory='" + subCategory + '\'' +
                ", category_id='" + category_id + '\'' +
                '}';
    }
}

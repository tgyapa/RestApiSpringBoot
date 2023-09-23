package com.restaurant.pos.Model;

import javax.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    public Product() {
    }

    public Product(int id, String pluCode, String description, Double price, int is_discount, int subCategoryId) {
        this.id = id;
        this.pluCode = pluCode;
        this.description = description;
        this.price = price;
        this.is_discount = is_discount;
        this.subCategoryId = subCategoryId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "plu_code")
    private String pluCode;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Double price;

    @Column(name = "is_discount")
    private int is_discount;

    @Column(name = "sub_category_id")
    private int subCategoryId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPluCode() {
        return pluCode;
    }

    public void setPluCode(String pluCode) {
        this.pluCode = pluCode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getIs_discount() {
        return is_discount;
    }

    public void setIs_discount(int is_discount) {
        this.is_discount = is_discount;
    }

    public int getSubCategoryId() {
        return subCategoryId;
    }

    public void setSubCategoryId(int subCategoryId) {
        this.subCategoryId = subCategoryId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", pluCode='" + pluCode + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", is_discount=" + is_discount +
                ", subCategoryId=" + subCategoryId +
                '}';
    }
}

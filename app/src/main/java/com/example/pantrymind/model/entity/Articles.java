package com.example.pantrymind.model.entity;


import androidx.room.*;

@Entity
public class Articles {

    @PrimaryKey
    private int id;

    private String productName;
    private String productCategory;


    public Articles(int id, String productName, String productCategory) {
        this.id = id;
        this.productName = productName;
        this.productCategory = productCategory;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }
}

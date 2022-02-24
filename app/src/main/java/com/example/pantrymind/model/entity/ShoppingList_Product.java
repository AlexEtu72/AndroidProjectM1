package com.example.pantrymind.model.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(foreignKeys={ @ForeignKey(
        entity = ShoppingList.class,
        parentColumns = "id",
        childColumns = "sLId"
),
        @ForeignKey(
                entity = Food.class,
                parentColumns = "id",
                childColumns = "pId"
        )},
        primaryKeys = {"sLId", "pId"})
public class ShoppingList_Product {

    private int sLId;
    private int pId;

    public ShoppingList_Product() {

    }

    public ShoppingList_Product(ShoppingList s,Product p) {
        this.pId=p.getId();
        this.sLId=s.getId();
    }

    public int getSLId() {
        return sLId;
    }

    public void setSLId(int sLId) {
        this.sLId = sLId;
    }

    public int getPId() {
        return pId;
    }

    public void setPId(int pId) {
        this.pId = pId;
    }
}

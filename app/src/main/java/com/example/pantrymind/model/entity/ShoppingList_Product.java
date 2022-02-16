package com.example.pantrymind.model.entity;

import androidx.room.Entity;
import androidx.room.ForeignKey;

@Entity(foreignKeys={ @ForeignKey(
        entity = ShoppingList.class,
        parentColumns = "id",
        childColumns = "sLId"
),
        @ForeignKey(
                entity = Product.class,
                parentColumns = "id",
                childColumns = "pId"
        )},
        primaryKeys = {"sLId", "pId"})
public class ShoppingList_Product {

    private int sLId;
    private int pId;

    public ShoppingList_Product(ShoppingList sLId, Product pId) {
        this.sLId = sLId.getId();
        this.pId = pId.getId();
    }

    public int getsLId() {
        return sLId;
    }

    public void setsLId(int sLId) {
        this.sLId = sLId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }
}

package com.example.pantrymind.model.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pantrymind.model.entity.ShoppingList;
import com.example.pantrymind.model.entity.ShoppingList_Product;

import java.util.List;

@Dao
public interface ShoppingList_ProductDAO {
    @Insert
    void insert(ShoppingList_Product SLP);

    @Update
    public void updateFood(ShoppingList_Product... SLPs);

    @Delete
    void delete(ShoppingList_Product SLP);

    @Query("SELECT * FROM shoppinglist_product")
    List<ShoppingList_Product> getAll();
}
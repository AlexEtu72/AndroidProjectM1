package com.example.pantrymind.model.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pantrymind.model.entity.ShoppingList;

import java.util.List;

@Dao
public interface ShoppingListDAO {

    @Insert
    void insert(ShoppingList SL);

    @Update
    public void updateShoppingList(ShoppingList... SLs);

    @Delete
    void delete(ShoppingList SL);

    @Query("SELECT * FROM shoppinglist")
    List<ShoppingList> getAll();
}
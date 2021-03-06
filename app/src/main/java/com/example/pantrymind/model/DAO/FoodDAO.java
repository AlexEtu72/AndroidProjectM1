package com.example.pantrymind.model.DAO;

import androidx.room.*;

import com.example.pantrymind.model.entity.Food;
import com.example.pantrymind.model.entity.ShoppingList;

import java.util.List;

@Dao
public interface FoodDAO {
    @Insert
    void insert(Food food);

    @Update
    public void updateFood(Food... foods);

    @Delete
    void delete(Food food);

    @Query("SELECT * FROM food")
    List<Food> getAll();

    @Query("SELECT * from food WHERE id like (:id)")
    public Food getFoodbyId(int id);
}
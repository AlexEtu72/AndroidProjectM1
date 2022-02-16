package com.example.pantrymind.model.DAO;

import androidx.room.*;

import com.example.pantrymind.model.entity.Food;

import java.util.List;

@Dao
public interface FoodDAO {
    @Insert
    void insert(Food food);

    @Delete
    void delete(Food food);

    @Query("SELECT * FROM food")
    List<Food> getAll();
}
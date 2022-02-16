package com.example.pantrymind.model.entity;


import androidx.room.*;
import java.time.LocalDate;

@Entity
public class Food extends Product{

    @PrimaryKey
    private int id;

    private int calories;


    public Food(String name,int quantity,int refill,int calories) {
        super(name,quantity,refill);

        this.setRoom("Kitchen");
        this.setCalories(calories);
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories){
        this.calories=calories;
    }
}
package com.example.pantrymind.model.entity;


import androidx.annotation.NonNull;
import androidx.room.*;
import java.time.LocalDate;

@Entity
public class Food extends Product{

    @PrimaryKey
    private int id;

    private int calories;

    public Food(){
        super();
    }


    public Food(String name,int quantity,int calories) {
        super(name,quantity);

        this.setRoom(Room.KITCHEN);
        this.setCalories(calories);
    }


    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories){
        this.calories=calories;
    }

    @NonNull
    @Override
    public String toString(){
        return this.getName();
    }
}
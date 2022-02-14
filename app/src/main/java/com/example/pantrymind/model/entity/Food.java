package com.example.pantrymind.model.entity;


import java.time.LocalDate;


public class Food extends Product{


    public Food(String name,int quantity,int refill) {
        this.setID(132154L);  //TODO : ADD RNG
        this.setRoom("Kitchen");

        this.setName(name);
        this.setQuantity(quantity);
        this.setExpiration(LocalDate.now().plusDays((long)refill));
        updateState();

    }


    public void updateExpiration(int days){
        this.setExpiration(LocalDate.now().plusDays((long)days));
    }



    public void updateState(){
        if(LocalDate.now().isBefore(this.getExpiration().minusDays(7))){
            this.setState(alertState.GREEN);
        }
        if(LocalDate.now().isAfter(this.getExpiration().minusDays(7))){
            this.setState(alertState.YELLOW);
        }
        if(LocalDate.now().isBefore(this.getExpiration().minusDays(2))){
            this.setState(alertState.RED);
        }
        //TODO : Add product to ShoppingList

    }





}
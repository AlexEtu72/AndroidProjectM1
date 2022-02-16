package com.example.pantrymind.model.entity;

import java.time.LocalDate;

public abstract class Product {

    private int id;
    private String name;
    private int quantity;

    private String room;




    public Product(String name,int quantity,int refill){
        this.setId(132154);  //TODO : ADD RNG
        this.setName(name);
        this.setQuantity(quantity);

        //this.setExpiration(LocalDate.now().plusDays((long)refill));
        //updateState();

    }




    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }





    public String getRoom() {
        return room;
    }

    public void setRoom(String Room) {
        this.room = Room;
    }


}
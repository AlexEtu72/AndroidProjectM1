package com.example.pantrymind.model.entity;

import java.time.LocalDate;

public abstract class Product {

    private int id;
    private String name;
    private int quantity;

    private Room room;


    public enum Room{
        KITCHEN,
        BATHROOM,
        OTHER
    }


    public Product(){

    }


    public Product(String name,int quantity){
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





    public Room getRoom() {
        return room;
    }

    public void setRoom(Room Room) {
        this.room = Room;
    }


}
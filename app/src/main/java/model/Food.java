package model;


import java.time.LocalDate;

public class Food extends Product{


    public Food(String name,int quantity,int refill) {
        this.setID(132154l);  //TODO : ADD RNG
        this.setRoom("Kitchen");

        this.setName(name);
        this.setQuantity(quantity);
        this.setExpiration(LocalDate.now().plusDays((long)refill));


    }






}

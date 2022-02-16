package com.example.pantrymind.model.entity;


import androidx.room.*;

import java.time.LocalDate;

@Entity(foreignKeys ={ @ForeignKey(entity = Product.class,
        parentColumns = "id",
        childColumns = "productId",
        onDelete = ForeignKey.CASCADE )})
public class Reminder {


    @PrimaryKey
    private int productId;

    private LocalDate expiration;
    //expiration is the products quantity going to 0
    //as we provided the usage per unit per day
    private alertState state;



    public Reminder(Product product, int usagePerUnit) {
        this.productId = product.getId();
        updateExpiration(usagePerUnit * product.getQuantity());
        updateState();
    }

    enum alertState {
        GREEN,
        YELLOW,
        RED;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public alertState getState() {
        return state;
    }

    public void setState(alertState state) {
        this.state = state;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
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
        //TODO : change product quantity accordingly
        //TODO : Add product to ShoppingList

    }

}

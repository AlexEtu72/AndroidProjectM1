package model;

public abstract class Product {

    private String Name;
    private long refill; //days before re-buy or using days
    private alertState state;

    enum alertState {
        GREEN,
        YELLOW,
        RED;
    }


}
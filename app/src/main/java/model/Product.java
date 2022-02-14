package model;

import java.time.LocalDate;

public abstract class Product {

    private long ID;
    private String Name;
    private int quantity;
    private LocalDate expiration;
    private alertState state;
    private String Room;


    enum alertState {
        GREEN,
        YELLOW,
        RED;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getExpiration() {
        return expiration;
    }

    public void setExpiration(LocalDate expiration) {
        this.expiration = expiration;
    }

    public alertState getState() {
        return state;
    }

    public void setState(alertState state) {
        this.state = state;
    }

    public String getRoom() {
        return Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }


}
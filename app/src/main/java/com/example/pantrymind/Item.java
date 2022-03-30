package com.example.pantrymind;


public class Item {

    private String itemName;

    // Image name (Without extension)
    private String picName;
    private String description;

    public Item(String itemName, String picName,String description) {
        this.itemName= itemName;
        this.picName= picName;
        this.description= description;
    }

    public String getdescription() {
        return description;
    }

    public void setquantity(String description) {
        this.description = description;
    }

    public String getitemName() {
        return itemName;
    }

    public void setitemName(String itemName) {
        this.itemName = itemName;
    }

    public String getpicName() {
        return picName;
    }

    public void setpicName(String picName) {
        this.picName = picName;
    }

    @Override
    public String toString()  {
        return this.itemName+" (description: "+ this.description+")";
    }
}
package com.example.pantrymind.model.entity;


import androidx.annotation.NonNull;
import androidx.room.*;

@Entity(foreignKeys={ @ForeignKey(
        entity = Articles.class,
        parentColumns = "id",
        childColumns = "pId"
)},
        primaryKeys = {"pId", "barcode"})

public class Articles_Barcodes {

    @NonNull
    private String barcode;
    @NonNull
    private String pId;

    public Articles_Barcodes(){

    }



    @NonNull
    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(@NonNull String barcode) {
        this.barcode = barcode;
    }

    public String getPId() {
        return pId;
    }

    public void setPId(String pId) {
        this.pId = pId;
    }
}

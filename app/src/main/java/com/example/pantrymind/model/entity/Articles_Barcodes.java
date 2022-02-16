package com.example.pantrymind.model.entity;


import androidx.room.*;

@Entity(foreignKeys={ @ForeignKey(
        entity = Product.class,
        parentColumns = "id",
        childColumns = "pId"
)},
        primaryKeys = {"pId", "barcode"})
public class Articles_Barcodes {

    private String barcode;
    private String pId;




    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }
}

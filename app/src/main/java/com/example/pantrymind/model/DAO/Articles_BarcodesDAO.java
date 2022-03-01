package com.example.pantrymind.model.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pantrymind.model.entity.Articles_Barcodes;

import java.util.List;

@Dao
public interface Articles_BarcodesDAO {
    @Insert
    void insert(Articles_Barcodes article);

    @Update
    void updateArticle(Articles_Barcodes... articles);

    @Delete
    void delete(Articles_Barcodes article);

    @Query("SELECT * FROM articles_barcodes")
    List<Articles_Barcodes> getAll();
}
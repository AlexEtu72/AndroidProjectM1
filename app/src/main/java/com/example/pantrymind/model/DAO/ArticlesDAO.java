package com.example.pantrymind.model.DAO;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.pantrymind.model.entity.Articles;

import java.util.List;

@Dao
public interface ArticlesDAO {
    @Insert
    void insert(Articles article);

    @Update
    void updateArticle(Articles... articles);

    @Delete
    void delete(Articles article);

    @Query("SELECT * FROM articles")
    List<Articles> getAll();

    @Query("SELECT * from articles WHERE id = (:id)")
    public Articles getArticleByID(int id);
}
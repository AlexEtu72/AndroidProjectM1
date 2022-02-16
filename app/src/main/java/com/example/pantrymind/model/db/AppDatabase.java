package com.example.pantrymind.model.db;

import androidx.room.*;

import com.example.pantrymind.model.DAO.ArticlesDAO;
import com.example.pantrymind.model.DAO.FoodDAO;
import com.example.pantrymind.model.DAO.ReminderDAO;
import com.example.pantrymind.model.DAO.ShoppingListDAO;
import com.example.pantrymind.model.DAO.ShoppingList_ProductDAO;
import com.example.pantrymind.model.entity.Articles;
import com.example.pantrymind.model.entity.Food;
import com.example.pantrymind.model.entity.Reminder;
import com.example.pantrymind.model.entity.ShoppingList;
import com.example.pantrymind.model.entity.ShoppingList_Product;

@Database(entities = {
        Food.class,
        Articles.class,
        ShoppingList.class,
        ShoppingList_Product.class,
        Reminder.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FoodDAO foodDao();
    public abstract ArticlesDAO articlesDAO();
    public abstract ShoppingListDAO shoppingListDAO();
    public abstract ShoppingList_ProductDAO shoppingList_productDAODAO();
    public abstract ReminderDAO reminderDAO();


}
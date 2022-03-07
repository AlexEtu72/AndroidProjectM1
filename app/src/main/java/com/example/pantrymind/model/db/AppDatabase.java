package com.example.pantrymind.model.db;

import androidx.room.*;
import android.content.Context;

import com.example.pantrymind.model.DAO.ArticlesDAO;
import com.example.pantrymind.model.DAO.Articles_BarcodesDAO;
import com.example.pantrymind.model.DAO.FoodDAO;
import com.example.pantrymind.model.DAO.ReminderDAO;
import com.example.pantrymind.model.DAO.ShoppingListDAO;
import com.example.pantrymind.model.DAO.ShoppingList_ProductDAO;
import com.example.pantrymind.model.entity.Articles;
import com.example.pantrymind.model.entity.Articles_Barcodes;
import com.example.pantrymind.model.entity.Food;
import com.example.pantrymind.model.entity.Reminder;
import com.example.pantrymind.model.entity.ShoppingList;
import com.example.pantrymind.model.entity.ShoppingList_Product;

@Database(entities = {
        Food.class,
        Articles.class,
        Articles_Barcodes.class,
        ShoppingList.class,
        ShoppingList_Product.class,
        Reminder.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract FoodDAO foodDao();
    public abstract ArticlesDAO articlesDAO();
    public abstract Articles_BarcodesDAO articles_barcodesDAO();
    public abstract ShoppingListDAO shoppingListDAO();
    public abstract ShoppingList_ProductDAO shoppingList_productDAODAO();
    public abstract ReminderDAO reminderDAO();

    private static AppDatabase INSTANCE;

    public static AppDatabase getDbInstance(Context context) {

        if(INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AppDatabase.class, "Data")
                    .allowMainThreadQueries()
                    .createFromAsset("databases/aa.db")
                    .build();

        }
        return INSTANCE;
    }

}
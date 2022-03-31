package com.example.pantrymind;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import com.example.pantrymind.model.DAO.ArticlesDAO;
import com.example.pantrymind.model.DAO.FoodDAO;
import com.example.pantrymind.model.DAO.ShoppingListDAO;
import com.example.pantrymind.model.DAO.ShoppingList_ProductDAO;
import com.example.pantrymind.model.db.AppDatabase;
import com.example.pantrymind.model.entity.Articles;
import com.example.pantrymind.model.entity.Food;
import com.example.pantrymind.model.entity.ShoppingList;
import com.example.pantrymind.model.entity.ShoppingList_Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListDisplayActivity extends AppCompatActivity {

    ListView lv= null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_list_details);
        lv= findViewById(R.id.Articles);


        if (savedInstanceState == null) {
            // Get the selected song position from the intent extra.
            int id =
                    getIntent().getIntExtra("selectedItemPosition",0);

        TextView title = findViewById(R.id.SL);
        AppDatabase db = AppDatabase.getDbInstance(getApplicationContext());
            ShoppingListDAO dao1= db.shoppingListDAO();
            ShoppingList s1 =dao1.getSLbyId(id);
            title.setText(s1.getName());
            ShoppingList_ProductDAO dao2 = db.shoppingList_productDAODAO();
            ArrayList<Food> food= new ArrayList<Food>();
            ArrayList<ShoppingList_Product> aa = (ArrayList<ShoppingList_Product>) dao2.getAll();
            FoodDAO dao3 =db.foodDao();

            for (ShoppingList_Product a : aa){
                if (a.getSLId()==id){
                Food x =dao3.getFoodbyId(a.getPId());
                food.add(x);
                }
            }
            lv.setAdapter(new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, food));

        }
}
    @Override
    protected void onDestroy() {
        super.onDestroy();
        lv.setAdapter(new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, new ArrayList<>()));
    }

}


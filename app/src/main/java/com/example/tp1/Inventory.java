package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

public class Inventory extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inventory_layout);

        /*ListView listOfLists = (ListView) findViewById(R.id.listOfLists);

        listOfLists.setOnTouchListener(new OnSwipeTouchListener(Inventory.this) {
            public void onSwipeRight() {
                startActivity(new Intent(Inventory.this, MainActivity.class));
            }
        });*/
    }

}
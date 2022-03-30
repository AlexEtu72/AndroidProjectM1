package com.example.pantrymind;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

public class ShoppingListDisplayActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.shopping_list_details);


        if (savedInstanceState == null) {
            // Get the selected song position from the intent extra.
            String selectedSong =
                    getIntent().getStringExtra("selectedItemPosition");

        TextView title = findViewById(R.id.SL);
        title.setText(selectedSong);
        }
    }


}

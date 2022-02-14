package com.example.tp1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button yourButton = (Button) findViewById((R.id.buttonStock));

        yourButton.setOnClickListener(new OnClickListener(){
            public void onClick(View v){
                startActivity(new Intent(MainActivity.this, Inventory.class));
            }
        });
    }




}
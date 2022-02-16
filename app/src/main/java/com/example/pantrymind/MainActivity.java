package com.example.pantrymind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPagerMain);

        setViewPagerAdapter();

    }

    public void setViewPagerAdapter() {
        ViewPager2Adapter viewPager2Adapter = new ViewPager2Adapter(this);
        ArrayList<Fragment> fragmentList = new ArrayList<>(); //creates an ArrayList of Fragments
        fragmentList.add(new ListsFragment());
        fragmentList.add(new StockFragment());
        fragmentList.add(new ScanFragment());
        fragmentList.add(new AlertFragment());
        fragmentList.add(new ProfilFragment());

        viewPager2Adapter.setData(fragmentList); //sets the data for the adapter
        viewPager2.setAdapter(viewPager2Adapter);
    };


}
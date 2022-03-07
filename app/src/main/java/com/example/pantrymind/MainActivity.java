package com.example.pantrymind;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.room.Room;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.util.Log;

import com.example.pantrymind.model.DAO.FoodDAO;
import com.example.pantrymind.model.db.AppDatabase;
import com.example.pantrymind.model.entity.Food;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements TabLayoutMediator.TabConfigurationStrategy {

    ViewPager2 viewPager2;
    TabLayout tabLayout;
    ArrayList<String> titles;
    ArrayList<Integer> icons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //DB INIT
        AppDatabase db = AppDatabase.getDbInstance(getApplicationContext());
        Log.i("DB LOADED","done");

        setContentView(R.layout.activity_main);
        viewPager2 = findViewById(R.id.viewPagerMain);
        tabLayout = findViewById(R.id.tabLayoutMain);



        setViewPagerAdapter();

        new TabLayoutMediator(tabLayout, viewPager2, this).attach();

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
    }



    @Override
    public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
        titles = new ArrayList<String>();
        titles.add(getResources().getString(R.string.lists));
        titles.add(getResources().getString(R.string.inventory));
        titles.add(getResources().getString(R.string.scan));
        titles.add(getResources().getString(R.string.alert));
        titles.add(getResources().getString(R.string.profile));


        icons = new ArrayList<Integer>();
        icons.add(R.drawable.list_icon);
        icons.add(R.drawable.ic_baseline_shopping_bag_24);
        icons.add(R.drawable.ic_baseline_center_focus_strong_24);
        icons.add(R.drawable.ic_baseline_notifications_24);
        icons.add(R.drawable.ic_baseline_account_box_24);
        tab.setText(titles.get(position));
        tab.setIcon(icons.get(position));

    }


}
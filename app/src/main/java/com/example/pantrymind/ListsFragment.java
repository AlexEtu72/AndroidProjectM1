package com.example.pantrymind;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pantrymind.model.DAO.ShoppingListDAO;
import com.example.pantrymind.model.db.AppDatabase;
import com.example.pantrymind.model.entity.ShoppingList;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ListsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ListsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment ListsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ListsFragment newInstance(String param1, String param2) {
        ListsFragment fragment = new ListsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lists, container, false);

        //AppDatabase db = AppDatabase.getDbInstance(getContext());
        //ShoppingListDAO dao = db.shoppingListDAO();
        //ShoppingList[] x = dao.getAll().toArray(new ShoppingList[0]);

        List<Item> image_details = getListData();

        ListView lv =(ListView) view.findViewById(R.id.SLLV);
        lv.setAdapter(new CustomListAdapter(getActivity(), image_details));
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position,
                                    long id){
                    Context context = view.getContext();
                    Intent intent = new Intent(context,
                            ShoppingListDisplayActivity.class);
                    intent.putExtra("selectedItemPosition",position+1 );
                    context.startActivity(intent);
                };});




        //ArrayAdapter<ShoppingList> LVA = new ArrayAdapter<ShoppingList>(
          //      getActivity(),
            //    android.R.layout.simple_list_item_1,
             //   image_details
               // );

        //lv.setAdapter(LVA);

        // Inflate the layout for this fragment
        return view;
    }


    private  List<Item> getListData() {

        AppDatabase db = AppDatabase.getDbInstance(getContext());
        ShoppingListDAO dao = db.shoppingListDAO();
        ShoppingList[] x = dao.getAll().toArray(new ShoppingList[0]);

        List<Item> list = new ArrayList<Item>();

        for(int i = 0;i<x.length;i++){
            list.add(new Item(x[i].getName(),x[i].getName().toLowerCase(Locale.ROOT) ,x[i].getDescription()));
        }

        return list;
    }


}
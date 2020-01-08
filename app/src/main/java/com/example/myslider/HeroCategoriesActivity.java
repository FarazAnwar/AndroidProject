package com.example.myslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class HeroCategoriesActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private HeroCategoriesAdapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_categories);
        recyclerView=findViewById(R.id.recyclerView);

        ArrayList<HeroCategoriesDataAdapter> arrayList=new ArrayList<>();
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.image,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.hhh,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.image,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.hhh,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.image,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.hhh,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.image,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));
        arrayList.add(new HeroCategoriesDataAdapter(R.drawable.hhh,"Home Clearing","Jop ID:2233","Show current Date","Show Cuurrent Location"));

        recyclerView.setHasFixedSize(true);
        mAdapter=new HeroCategoriesAdapter(arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(mAdapter);
    }
}

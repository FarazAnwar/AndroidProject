package com.example.myslider;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private ViewPager vp;
 private RecyclerView rv;
 private Addapter mAdapter;

    private Integer [] images={R.drawable.image,R.drawable.hhh,R.drawable.image,R.drawable.image};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vp=findViewById(R.id.vp);
        rv=findViewById(R.id.rv);

        ArrayList<DataAdapter>arrayList=new ArrayList<>();
        arrayList.add(new DataAdapter(R.drawable.image,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.hhh,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.image,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.hhh,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.image,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.hhh,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.image,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.hhh,"Faraz"));
        arrayList.add(new DataAdapter(R.drawable.image,"Faraz"));
        rv.setHasFixedSize(true);
        mAdapter=new Addapter(arrayList);
        rv.setLayoutManager(new GridLayoutManager(this,3));
        rv.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new Addapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Toast.makeText(MainActivity.this, "Card Clicked", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(getApplicationContext(),HeroCategoriesActivity.class));
            }
        });

        ViewPagerAdapter viewPagerAdapter=new ViewPagerAdapter(this,images);
        vp.setAdapter(viewPagerAdapter);
    }
}

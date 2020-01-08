package com.example.myslider;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HeroCategoriesAdapter extends RecyclerView.Adapter<HeroCategoriesAdapter.MyViewHolder> {
    private ArrayList<HeroCategoriesDataAdapter> heroCategoriesDataAdapters;
    public HeroCategoriesAdapter(ArrayList<HeroCategoriesDataAdapter>mheroCategoriesDataAdapters){
        heroCategoriesDataAdapters=mheroCategoriesDataAdapters;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.herocategoriesadapterlayout,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        HeroCategoriesDataAdapter hcda=heroCategoriesDataAdapters.get(i);
        myViewHolder.mImage.setImageResource(hcda.getmImage());
        myViewHolder.mtv.setText(hcda.getMtv());
        myViewHolder.mtv2.setText(hcda.getMtv2());
        myViewHolder.mtv3.setText(hcda.getMtv3());
        myViewHolder.mtv4.setText(hcda.getMtv4());
    }

    @Override
    public int getItemCount() {
        return heroCategoriesDataAdapters.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mImage;
        TextView mtv,mtv2,mtv3,mtv4;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            mImage=itemView.findViewById(R.id.mImage);
            mtv=itemView.findViewById(R.id.mtv);
            mtv2=itemView.findViewById(R.id.mtv2);
            mtv3=itemView.findViewById(R.id.mtv3);
            mtv4=itemView.findViewById(R.id.mtv4);
        }
    }
}

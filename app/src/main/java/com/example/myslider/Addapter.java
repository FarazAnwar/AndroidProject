package com.example.myslider;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Addapter extends RecyclerView.Adapter<Addapter.MyViewHolder> {

    private ArrayList<DataAdapter> dataAdapters;
    private OnItemClickListener mListener;

    public Addapter(ArrayList<DataAdapter>mdataAdpter){
        dataAdapters=mdataAdpter;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.customgrid,viewGroup,false);
        MyViewHolder myViewHolder=new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
       DataAdapter da=dataAdapters.get(i);
       myViewHolder.img.setImageResource(da.getImg());
       myViewHolder.tv.setText(da.getTv());
    }

    @Override
    public int getItemCount() {
        return dataAdapters.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img);
            tv=itemView.findViewById(R.id.tv);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mListener!=null){
                        int position= getAdapterPosition();
                        if (position!=RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }
    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener=listener;
    }
}

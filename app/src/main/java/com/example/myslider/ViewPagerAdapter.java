package com.example.myslider;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter ;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class ViewPagerAdapter extends PagerAdapter {
    private Context context;
    private Integer [] images;
    private LayoutInflater layoutInflater;
//    private Integer [] images={R.drawable.image,R.drawable.hhh,R.drawable.image,R.drawable.image};

    public ViewPagerAdapter(Context context,Integer[]images)
    {
        this.context = context;
        this.images=images;
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
//        layoutInflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
//        View view=layoutInflater.inflate(R.layout.custom,null);
//        ImageView imageView=(ImageView)view.findViewById(R.id.img);
//        imageView.setImageResource(images[position]);
//
//        ViewPager vp=(ViewPager)container;
//        vp.addView(view,0);
//        return view;
        ImageView imageView=new ImageView(context);
        Picasso.get()
                .load(images[position]).fit().centerCrop().into(imageView);
        container.addView(imageView);
        return imageView;

    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
//        ViewPager vp=(ViewPager)container;
//        View view=(View)object;
//        vp.removeView(view);
        container.removeView((View)object);
    }
}

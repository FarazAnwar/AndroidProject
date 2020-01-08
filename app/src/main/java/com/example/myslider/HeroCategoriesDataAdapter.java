package com.example.myslider;

public class HeroCategoriesDataAdapter {
    private int mImage;
    private String mtv;
    private String mtv2;
    private String mtv3;
    private String mtv4;

    public HeroCategoriesDataAdapter(int mImage, String mtv, String mtv2, String mtv3, String mtv4) {
        this.mImage = mImage;
        this.mtv = mtv;
        this.mtv2 = mtv2;
        this.mtv3 = mtv3;
        this.mtv4 = mtv4;
    }

    public int getmImage() {
        return mImage;
    }

    public String getMtv() {
        return mtv;
    }

    public String getMtv2() {
        return mtv2;
    }

    public String getMtv3() {
        return mtv3;
    }

    public String getMtv4() {
        return mtv4;
    }
}

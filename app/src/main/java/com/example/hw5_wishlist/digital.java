package com.example.hw5_wishlist;

public class digital {
    private String brand;
    private String qualityPrice;
    private int imageResourceId;

    public static digital[] digitalElem = {
            new digital("Ipad + Procreate","Excellent\n$240 Total",R.drawable.ipad),
            new digital("Wacom Tablet","Great\n$79.99 - $1,999.95",R.drawable.wacom),
            new digital("Clip Studio Paint","Good\n$59.99",R.drawable.csp)
    };

    private digital(String brand, String qualityPrice ,int imageResourceID) {
        this.brand = brand;
        this.qualityPrice = qualityPrice;
        this.imageResourceId = imageResourceID;
    }
    public String getBrand(){
        return brand;
    }
    public String getQualityPrice(){
        return qualityPrice;
    }
    public int getImageResourceId(){
        return imageResourceId;
    }
    public String toString(){
        return this.brand;
    }

}

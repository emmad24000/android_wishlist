package com.example.hw5_wishlist;

public class pencils {
    private String brand;
    private String qualityPrice;
    private int imageResourceId;

    public static pencils[] pencilsElem = {
            new pencils("Prismacolor","Great\n$89.00",R.drawable.prismacolor),
            new pencils("Crayola","Ok\n$0.99",R.drawable.crayola),
            new pencils("Castle","Good\n$37.99",R.drawable.castle)
    };

    private pencils(String brand, String qualityPrice, int imageResourceId) {
        this.brand = brand;
        this.qualityPrice = qualityPrice;
        this.imageResourceId = imageResourceId;
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

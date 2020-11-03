package com.example.hw5_wishlist;

public class paint {
    private String brand;
    private String qualityPrice;
    private int imageResourceId;

    public static paint[] paintElem = {
            new paint("Winsor&Newton","Great\n$31.49",R.drawable.winsor),
            new paint("BLICK","Good\n$34.99",R.drawable.blick),
            new paint("Castle","Better Be Good\n$108.47",R.drawable.senne)
    };

    private paint(String brand, String qualityPrice, int imageResourceId) {
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

package com.example.hw5_wishlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class displayDigital extends digitalActivity{
    ArrayList<digital> digitalArrayList = new ArrayList<digital>(Arrays.asList(digital.digitalElem));
    int index;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_specific_digital);
        index = (Integer)getIntent().getIntExtra("INDEX",0);
        digital digitalElem = digital.digitalElem[index];

        TextView brand = findViewById(R.id.brand);
        TextView qualityPrice = findViewById(R.id.qualityPrice);
        ImageView img = findViewById(R.id.img);

        brand.setText(digitalElem.getBrand());
        qualityPrice.setText(digitalElem.getQualityPrice());
        img.setImageResource(digitalElem.getImageResourceId());

    }

    public void deleteDigital(View view) {
        digitalArrayList.remove(index);
        digital.digitalElem = digitalArrayList.toArray(new digital[index]);
        Intent back = new Intent(displayDigital.this,digitalActivity.class);
        startActivity(back);
    }
}

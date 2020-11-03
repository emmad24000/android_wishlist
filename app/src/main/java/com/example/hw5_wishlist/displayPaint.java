package com.example.hw5_wishlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class displayPaint extends paintActivity{
    int index;
    ArrayList<paint> paintArrayList = new ArrayList<paint>(Arrays.asList(paint.paintElem));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_specific_paint);
        index = (Integer)getIntent().getIntExtra("INDEX",0);
        paint paintElem = paint.paintElem[index];

        TextView brand = findViewById(R.id.brand);
        TextView qualityPrice = findViewById(R.id.qualityPrice);
        ImageView img = findViewById(R.id.img);

        brand.setText(paintElem.getBrand());
        qualityPrice.setText(paintElem.getQualityPrice());
        img.setImageResource(paintElem.getImageResourceId());

    }

    public void deletePaint(View view) {
        paintArrayList.remove(index);
        paint.paintElem = paintArrayList.toArray(new paint[index]);
        Intent backPaint = new Intent(displayPaint.this,paintActivity.class);
        startActivity(backPaint);
    }
}

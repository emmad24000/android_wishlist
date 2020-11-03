package com.example.hw5_wishlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class displayPencils extends pencilsActivity{
    int index;
    ArrayList<pencils> pencilArrayList = new ArrayList<pencils>(Arrays.asList(pencils.pencilsElem));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display_specific_pencil);
        index = (Integer)getIntent().getIntExtra("INDEX",0);
        pencils pencilElem = pencils.pencilsElem[index];

        TextView brand = findViewById(R.id.brand);
        TextView info = findViewById(R.id.info);
        ImageView img = findViewById(R.id.img);

        brand.setText(pencilElem.getBrand());
        info.setText(pencilElem.getQualityPrice());
        img.setImageResource(pencilElem.getImageResourceId());

    }

    public void deletePencil(View view) {
        pencilArrayList.remove(index);
        pencils.pencilsElem = pencilArrayList.toArray(new pencils[index]);
        Intent backPencils = new Intent(displayPencils.this,pencilsActivity.class);
        startActivity(backPencils);
    }
}

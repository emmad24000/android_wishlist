package com.example.hw5_wishlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class home extends AppCompatActivity {
    ListView homeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        homeList = findViewById(R.id.homeList);
        homeList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i == 0){
                    Intent startPencils = new Intent(getApplicationContext(),pencilsActivity.class);
                    startActivity(startPencils);
                }else if(i ==1){
                    Intent startPaint = new Intent(getApplicationContext(),paintActivity.class);
                    startActivity(startPaint);

                }else if(i==2){
                    Intent startDigital = new Intent(getApplicationContext(),digitalActivity.class);
                    startActivity(startDigital);
                }
            }
        });

    }

}
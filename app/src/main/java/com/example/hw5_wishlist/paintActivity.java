package com.example.hw5_wishlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class paintActivity extends AppCompatActivity {
    boolean switchEnabled = false;
    ArrayList<paint> paintArrayList = new ArrayList<paint>(Arrays.asList(paint.paintElem));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paint_general);
        final ArrayAdapter<paint> paintAdapter = new ArrayAdapter<>
                (getApplicationContext(),android.R.layout.simple_list_item_1,paintArrayList);
        ListView listPaint = (ListView) findViewById(R.id.paintListView);
        listPaint.setAdapter(paintAdapter);

        AdapterView.OnItemClickListener itemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(!switchEnabled) {
                    Intent specificPaint = new Intent(paintActivity.this, displayPaint.class);
                    specificPaint.putExtra("INDEX", i);
                    startActivity(specificPaint);
                }else{
                    paintArrayList.remove(i);
                    paintAdapter.notifyDataSetChanged();
                }
            }
        };
        listPaint.setOnItemClickListener(itemClickListener);

    }

    public void paintToggleDeleteMode(View view) {
        if(switchEnabled){
            switchEnabled = false;
        }else{
            switchEnabled = true;
        }
    }
}

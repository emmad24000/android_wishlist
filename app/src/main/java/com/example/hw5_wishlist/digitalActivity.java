package com.example.hw5_wishlist;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Switch;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class digitalActivity extends AppCompatActivity {
    boolean switchEnabled = false;
    ArrayList<digital> digitalArrayList = new ArrayList<digital>(Arrays.asList(digital.digitalElem));
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digital_general);
        final ArrayAdapter<digital> digitalAdapter = new ArrayAdapter<>(
                getApplicationContext(),android.R.layout.simple_list_item_1,digitalArrayList);

        final ListView listDigital = (ListView) findViewById(R.id.digitalListView);
        listDigital.setAdapter(digitalAdapter);

        listDigital.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (!switchEnabled) {
                    Intent specificDigital = new Intent(getApplicationContext(), displayDigital.class);
                    specificDigital.putExtra("INDEX", i);
                    startActivity(specificDigital);
                } else {
                    digitalArrayList.remove(i);
                    digitalAdapter.notifyDataSetChanged();
                }
            }
        });
    }

    public void toggleDeleteMode(View view) {
        if(!switchEnabled){
            switchEnabled = true;
        }else{
            switchEnabled = false;
        }
    }
}

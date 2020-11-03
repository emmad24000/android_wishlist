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

public class pencilsActivity extends AppCompatActivity {
    boolean switchEnabled = false;
    ArrayList<pencils> pencilArrayList = new ArrayList<pencils>(Arrays.asList(pencils.pencilsElem));

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pencils_general);
        final ArrayAdapter<pencils> pencilAdapter = new ArrayAdapter<>(getApplicationContext(),android.R.layout.simple_list_item_1,pencilArrayList);
        ListView listPencils = (ListView) findViewById(R.id.pencilsListView);
        listPencils.setAdapter(pencilAdapter);

        listPencils.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(switchEnabled == false) {
                    Intent specificPencil = new Intent(pencilsActivity.this, displayPencils.class);
                    specificPencil.putExtra("INDEX", i);
                    startActivity(specificPencil);
                }else{
                    pencilArrayList.remove(i);
                    pencilAdapter.notifyDataSetChanged();
                }
            }
        });
    }

    public void pencilsToggleDelete(View view) {
        if(switchEnabled == true){
            switchEnabled = false;
        }else{
            switchEnabled = true;
        }
    }
}

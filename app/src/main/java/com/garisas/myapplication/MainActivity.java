package com.garisas.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Spinner _spiner1, _spiner2, _spiner3, _spiner4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _spiner1 = findViewById(R.id.spinner1);
        _spiner2 = findViewById(R.id.spinner2);
        _spiner3 = findViewById(R.id.spinner3);
        _spiner4 = findViewById(R.id.spinner4);

        initSpinner1();
        initSpinner2();
        initSpinner3();
        initSpinner4();
    }

    private void initSpinner1() {
        List<String> buahList = new ArrayList<>();
        buahList.add("Rambutan");
        buahList.add("Langsat Punggor");
        buahList.add("Nangka");
        buahList.add("Mangga");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, buahList);
        _spiner1.setAdapter(arrayAdapter);
    }

    private void initSpinner2() {
        List<String> mahasiswaList = new ArrayList<>();
        for (int i = 1; i<=1000; i++){
            mahasiswaList.add("Mahasiswa ke-"+ i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, mahasiswaList);
        _spiner2.setAdapter(arrayAdapter);
    }

    private void initSpinner3() {
        List<String> ganjilList = new ArrayList<>();
        for(int i = 1; i<=999; i+=2){
            ganjilList.add("Bilang ke-"+ i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, ganjilList);
        _spiner3.setAdapter(arrayAdapter);
    }

    private void initSpinner4() {
        List<String> genapList = new ArrayList<>();
        for(int i = 2; i<=1000; i+=2){
            genapList.add("Bilang ke-"+ i);
        }
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, genapList);
        _spiner4.setAdapter(arrayAdapter);
    }
}
package com.example.ecoba.tofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class diyet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diyet);

    }

    public void btn_Oneri(View view)
    {
        Intent intent;
        intent = new Intent(getApplicationContext(),oneridiyet.class);
        startActivity(intent);
    }
    public void btn_Akdeniz(View view)
    {
        Intent intent;
        intent = new Intent(getApplicationContext(),akdenizdiyeti.class);
        startActivity(intent);
    }
}

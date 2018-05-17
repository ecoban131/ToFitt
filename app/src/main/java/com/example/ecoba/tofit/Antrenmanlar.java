package com.example.ecoba.tofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Antrenmanlar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_antrenmanlar);
    }
    public void btn_Chest(View view)
    {
        Intent intent=new Intent(getApplicationContext(),chest.class);
        startActivity(intent);
    }
    public void btn_Shoulder(View view)
    {
        Intent intent=new Intent(getApplicationContext(),shoulder.class);
        startActivity(intent);
    }
    public void btn_Arm(View view)
    {
        Intent intent=new Intent(getApplicationContext(),arm.class);
        startActivity(intent);
    }
    public void btn_Sırt(View view)
    {
        Intent intent=new Intent(getApplicationContext(),back.class);
        startActivity(intent);
    }
    public void btn_Bacak(View view)
    {
        Intent intent=new Intent(getApplicationContext(),leg.class);
        startActivity(intent);
    }
}

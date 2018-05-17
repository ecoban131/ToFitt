package com.example.ecoba.tofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_Hesapla(View view)
    {

        Intent intent=new Intent(getApplicationContext(),hesaplaActivity.class);
        startActivity(intent);
    }
    public void btn_Besinler(View view)
    {
        Intent intent=new Intent(getApplicationContext(),besinActivity.class);
        startActivity(intent);
    }
    public void btn_Antrenman(View view)
    {
        Intent intent=new Intent(getApplicationContext(),Antrenmanlar.class);
        startActivity(intent);
    }
    public void btn_Diyet(View view)
    {
        Intent intent=new Intent(getApplicationContext(),diyet.class);
        startActivity(intent);
    }
    public void btn_Hakkimizda(View view)
    {
        Intent intent=new Intent(getApplicationContext(),hakkimizda.class);
        startActivity(intent);
    }
    public void btn_Iletisim(View view)
    {
        Intent intent=new Intent(getApplicationContext(),iletisim.class);
        startActivity(intent);
    }
}

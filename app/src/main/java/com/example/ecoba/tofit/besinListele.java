package com.example.ecoba.tofit;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class besinListele extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_besin_listele);
        TextView textView=(TextView) findViewById(R.id.adText);
       TextView textView2=(TextView) findViewById(R.id.kalText);
        TextView textView3=(TextView) findViewById(R.id.proText);
        TextView textView4=(TextView) findViewById(R.id.lifText);
        TextView textView5=(TextView) findViewById(R.id.karbText);


        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        textView2.setText(besinActivity.selectedCal);
        textView3.setText(besinActivity.selectedPro);
        textView4.setText(besinActivity.selectedLif);
        textView5.setText(besinActivity.selectedCarb);

        textView.setText(name);



    }
}

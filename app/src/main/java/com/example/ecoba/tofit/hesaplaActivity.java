package com.example.ecoba.tofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class hesaplaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hesapla);


        Button btnHesapla=(Button) findViewById(R.id.btnHesapla);
       final TextView boyText=(TextView) findViewById(R.id.boyText);
       final TextView kiloText=(TextView) findViewById(R.id.kiloText);
       final TextView yasText=(TextView) findViewById(R.id.yasText);

        btnHesapla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            int s_boyText=Integer.parseInt(boyText.getText().toString());
                int s_kiloText=Integer.parseInt(kiloText.getText().toString());
                int s_yasText=Integer.parseInt(yasText.getText().toString());
                RadioButton az_hareket,orta_hareket,cok_hareket;
                az_hareket=(RadioButton) findViewById(R.id.rbtnAz);
                orta_hareket=(RadioButton) findViewById(R.id.rbtnOrta);
                cok_hareket=(RadioButton) findViewById(R.id.rbtnCok);
                double bazalMetabolizma=66.47+(13.7*s_kiloText)+(5*s_boyText)-(6.8*s_yasText);
                 TextView sonuc_Text=(TextView) findViewById(R.id.sonucText);

                double sonuc;

                if (az_hareket.isChecked())
                {

                    sonuc=bazalMetabolizma*1.4;
                    sonuc_Text.setText("Günlük Kalori İhtiyacınız= "+sonuc);
                }
                else if(orta_hareket.isChecked())
                {
                    sonuc=bazalMetabolizma*1.7;
                    sonuc_Text.setText("Günlük Kalori İhtiyacınız= "+sonuc);
                }
                else if (cok_hareket.isChecked())
                {
                    sonuc=bazalMetabolizma*2.0;
                    sonuc_Text.setText("Günlük Kalori İhtiyacınız= "+sonuc);
                }
                else    {
                    Toast.makeText(getApplicationContext(),"Bir Yaşam Stili Seçmelisiniz", Toast.LENGTH_LONG).show();
                }

            }
        });

    }


}

package com.example.ecoba.tofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class akdenizdiyeti extends AppCompatActivity {
    RadioButton pazartesi,sali,carsamba,persembe,cuma,cumartesi,pazar;
    TextView text1,text22,text3,text4,text5,text6,text7,text8,text9,text10,text11;
    Button btn_Goster2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akdenizdiyeti);
        pazartesi=(RadioButton) findViewById(R.id.rbtn_Pazartesi);
        sali =(RadioButton) findViewById(R.id.rbtn_Sali);
        carsamba=(RadioButton) findViewById(R.id.rbtn_Carsamba);
        persembe=(RadioButton) findViewById(R.id.rbtn_Persembe);
        cuma=(RadioButton) findViewById(R.id.rbtn_Cuma);
        cumartesi=(RadioButton) findViewById(R.id.rbtn_Cumartesi);
        pazar=(RadioButton) findViewById(R.id.rbtn_Pazar);

        text1=(TextView) findViewById(R.id.text1);
        text22=(TextView) findViewById(R.id.text2);
        text3=(TextView) findViewById(R.id.text3);
        text4=(TextView) findViewById(R.id.text4);
        text5=(TextView) findViewById(R.id.text5);
        text6=(TextView) findViewById(R.id.text6);
        text7=(TextView) findViewById(R.id.text7);
        text8=(TextView) findViewById(R.id.text8);
        text9=(TextView) findViewById(R.id.text9);
        text10=(TextView) findViewById(R.id.text10);
        text11=(TextView) findViewById(R.id.text11);
        btn_Goster2=(Button) findViewById(R.id.btn_Goster2);


        btn_Goster2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (pazartesi.isChecked())
                {
                    text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("1 Dilim Peynirk");
                    text3.setText("Domates ve Salatalık");
                    text4.setText("Tuzsuz Zeytin");
                    text5.setText("4-5 Adet Fındık");
                    text6.setText("1 tane simit");
                    text7.setText("Domates ve Salatalık");
                    text8.setText("1 Bardak Ayran");
                    text9.setText("Et Sote");
                    text10.setText("1 Ceviz 3 Badem");
                    text11.setText("1 Adet Kivi");
                }

                if (sali.isChecked())
                {
                    text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("Domates ve Salatalık");
                    text3.setText("5 Tuzsuz Zeytin");
                    text4.setText("1 Dilim Peynir");
                    text5.setText("4 Fındık 1 Ceviz");
                    text6.setText("1 tane Simit");
                    text7.setText("Domates ve Salatalık");
                    text8.setText("1 Bardak Ayran");
                    text9.setText("Kıymalı Ispanak");
                    text10.setText("2 Çoba kasşığı yoğurt");
                    text11.setText("Salata Tuzsuz");
                }
                if (carsamba.isChecked())
                {
                    text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("Domates ve Salatalık");
                    text3.setText("5 Tuzsuz Zeytin");
                    text4.setText("1 Dilim Peynir");
                    text5.setText("4 Fındık 1 Ceviz");
                    text6.setText("Peynirli Sandviç");
                    text7.setText("Domates ve Salatalık");
                    text8.setText("1 Bardak Ayran");
                    text9.setText("Etli Taze Fasulye");
                    text10.setText("Salata Tuzsuz");
                    text11.setText("1 Kaşık Yoğurt");
                }
                if (persembe.isChecked())
                {

                    text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("Domates ve Salatalık");
                    text3.setText("5 Tuzsuz Zeytin");
                    text4.setText("1 Dilim Peynir");
                    text5.setText("4 Fındık 1 Ceviz");
                    text6.setText("Avuç içi Badem");
                    text7.setText("1 Meyve Tabağı");
                    text8.setText("1 kase yoğurt");
                    text9.setText("Peynirli Mantarlı Makarna");
                    text10.setText("Salata");
                    text11.setText("1 Bardak Ayran");
                }
                if (cuma.isChecked())
                {text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("Domates ve Salatalık");
                    text3.setText("5 Tuzsuz Zeytin");
                    text4.setText("1 Dilim Peynir");
                    text5.setText("4 Fındık 1 Ceviz");
                    text6.setText("1 Meyve Tabağı");
                    text7.setText(" ");
                    text8.setText(" ");
                    text9.setText("Sebzeli Tavuk");
                    text10.setText("Makarna");
                    text11.setText("2 Salata");
                }
                if (cumartesi.isChecked())
                {
                    text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("Domates ve Salatalık");
                    text3.setText("5 Tuzsuz Zeytin");
                    text4.setText("1 Dilim Peynir");
                    text5.setText("4 Fındık 1 Ceviz");
                    text6.setText("Peynirli Sandviç");
                    text7.setText("2Domates ve Salatalık");
                    text8.setText("1 Bardak Ayran");
                    text9.setText("21 Tabak Çorba");
                    text10.setText("Izgara Balık");
                    text11.setText("Salata");
                }
                if (pazar.isChecked())
                {
                    text1.setText("2 Dilim Kepek ekmek");
                    text22.setText("Domates ve Salatalık");
                    text3.setText("5 Tuzsuz Zeytin");
                    text4.setText("1 Dilim Peynir");
                    text5.setText("4 Fındık 1 Ceviz");
                    text6.setText("Peynirli Omlet");
                    text7.setText("Salata");
                    text8.setText("Portakal Suyu");
                    text9.setText("2Mantarlı Pilav");
                    text10.setText("1 Kase Cacık");
                    text11.setText("Salata");
                }
            }
        });




    }
}

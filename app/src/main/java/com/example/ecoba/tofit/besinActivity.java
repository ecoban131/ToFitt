package com.example.ecoba.tofit;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class besinActivity extends AppCompatActivity {

static String selectedCal;
    static String selectedPro;
    static String selectedLif;
    static String selectedCarb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_besin);
        ListView listView=(ListView) findViewById(R.id.listView);

        final ArrayList<String> besinler = new ArrayList<String>();
        besinler.add("Zeytin yağı");
        besinler.add("Bulgur");
        besinler.add("Pirinç");
        besinler.add("Hindistan Cevizi Yağı");
        besinler.add("Yumurta");
        besinler.add("Tavuk Göğsü");
        besinler.add("Sığır Eti");
        besinler.add("Ton Balığı");
        besinler.add("Yulaf");
        besinler.add("Kayısı");
       final ArrayList<String> kaloriler=new ArrayList<String>();
        kaloriler.add("884");
        kaloriler.add("342");
        kaloriler.add("130");
        kaloriler.add("862");
        kaloriler.add("155");
        kaloriler.add("101");
        kaloriler.add("156");
        kaloriler.add("174");
        kaloriler.add("370");
        kaloriler.add("241");
       final ArrayList<String> proteinler=new ArrayList<String>();
        proteinler.add("0");
        proteinler.add("0");
        proteinler.add("0");
        proteinler.add("0");
        proteinler.add("13");
        proteinler.add("27");
        proteinler.add("25");
        proteinler.add("25");
        proteinler.add("0");
        proteinler.add("0");
        final ArrayList<String>Lifler=new ArrayList<String>();
        Lifler.add("0");
        Lifler.add("6");
        Lifler.add("0");
        Lifler.add("0");
        Lifler.add("0");
        Lifler.add("0");
        Lifler.add("0");
        Lifler.add("0");
        Lifler.add("12");
        Lifler.add("11");
        final ArrayList<String>karbonhidratlar=new ArrayList<String>();
        karbonhidratlar.add("0");
        karbonhidratlar.add("78");
        karbonhidratlar.add("77");
        karbonhidratlar.add("0");
        karbonhidratlar.add("0");
        karbonhidratlar.add("0");
        karbonhidratlar.add("0");
        karbonhidratlar.add("0");
        karbonhidratlar.add("57");
        karbonhidratlar.add("11");
/*
        int i =0;
for(i=0;i<besinler.size();i++) {
    Besinler besin = new Besinler(besinler.get(i), kaloriler.get(i), proteinler.get(i), Lifler.get(i), karbonhidratlar.get(i));
    BesinlerDB db = new BesinlerDB(getApplicationContext());

    long id = db.ekleBesin(besin);

}*/


        ArrayAdapter arrayAdapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,besinler);
        listView.setAdapter(arrayAdapter);
listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent=new Intent(getApplicationContext(),besinListele.class);
        intent.putExtra("name",besinler.get(position));
        selectedCal=kaloriler.get(position);
        selectedPro=proteinler.get(position);
        selectedLif=Lifler.get(position);
        selectedCarb=karbonhidratlar.get(position);
        startActivity(intent);
    }
});




    }
}

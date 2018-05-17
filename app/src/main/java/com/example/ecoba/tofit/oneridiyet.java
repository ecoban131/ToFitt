package com.example.ecoba.tofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class oneridiyet extends AppCompatActivity {
    EditText kalori;
    TextView yulafText,zeytinyagiText,yumurtaText,sebzeText,salataText,bulgurText,balikText,zeytinyagiText2,salataText2,pilavText,tavukText,zeytinyagiText3;
    double calorie,yulafGram,carb,pro,yag,yulafCal,zeytinyagiCal,zeytinyagiGram,yumurtaGram,yumurtaCal,bulgurCal,bulgurGram,balikCal,balikGram,zeytinyagi2Cal,zeytinyagi2Gram,pilavCal,pilavGram,tavukCal,tavukGram,zeytinyagi3Cal,zeytinyagi3Gram;
    Button goster;
    RadioButton rbtnAL,rbtnVer,rbtnKoru;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oneridiyet);

        kalori=(EditText)findViewById(R.id.editText);
        yulafText=(TextView) findViewById(R.id.yulafText);
        zeytinyagiText=(TextView)findViewById(R.id.zeytinyagiText);
        yumurtaText=(TextView)findViewById(R.id.yumurtaText);
        sebzeText=(TextView)findViewById(R.id.sebzeText);
        salataText=(TextView)findViewById(R.id.salataText);
        bulgurText=(TextView)findViewById(R.id.bulgurText);
        balikText=(TextView)findViewById(R.id.balikText);
        zeytinyagiText2=(TextView)findViewById(R.id.zeytinyagiText2);
        salataText2=(TextView)findViewById(R.id.salataText2);
        pilavText=(TextView)findViewById(R.id.pilavText);
       tavukText =(TextView)findViewById(R.id.tavukText);
        zeytinyagiText3=(TextView)findViewById(R.id.zeytinyagiText3);

        goster=(Button)findViewById(R.id.btn_Yazdir);
        rbtnVer=(RadioButton) findViewById(R.id.rbtn_Ver);
        rbtnAL=(RadioButton) findViewById(R.id.rbtn_Al);
        rbtnKoru=(RadioButton) findViewById(R.id.rbtn_Koru);


        goster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            calorie=Double.parseDouble(kalori.getText().toString());
          if (rbtnVer.isChecked())
          {
              NumberFormat nf=NumberFormat.getInstance();
              nf.setMaximumFractionDigits(1);

              calorie=calorie-calorie/10;
              carb=calorie/2;
              yag=calorie/4;
              pro=calorie/4;
              yulafCal=carb/5;
              zeytinyagiCal=yag/3;
              yumurtaCal=pro/3;
              bulgurCal=(carb*2)/5;
              balikCal=pro/3;
              zeytinyagi2Cal=yag/3;
              pilavCal=(carb*2)/5;
              tavukCal=pro/3;
              zeytinyagi3Cal=yag/3;


              yulafGram=yulafCal/3.7;
              zeytinyagiGram=zeytinyagiCal/8.7;
              yumurtaGram=yumurtaCal/1.5;
              bulgurGram=bulgurCal/3.4;
              balikGram=balikCal/1.7;
              zeytinyagi2Gram=zeytinyagi2Cal/8.7;
              pilavGram=pilavCal/3.6;
              tavukGram=tavukCal/1.1;
              zeytinyagi3Gram= zeytinyagi3Cal/8.7;


              String yulafGramx=nf.format(yulafGram);
              String zeytinyagiGramx=nf.format(zeytinyagiGram);
              String yumurtaGramx=nf.format(yulafGram);
              String bulgurGramx=nf.format(bulgurGram);
              String balikGramx=nf.format(balikGram);
              String zeytinyagi2Gramx=nf.format(zeytinyagi2Gram);
              String pilavGramx=nf.format(pilavGram);
              String tavukGramx=nf.format(tavukGram);
              String zeytinyagi3Gramx=nf.format(zeytinyagi3Gram);


              yulafText.setText("Yulaf="+yulafGramx+"gr");
              zeytinyagiText.setText("Zeytin Yaği= "+zeytinyagiGramx+"gr");
              yumurtaText.setText("Yumurta= "+yumurtaGramx+"gr");
              bulgurText.setText("Bulgur= "+bulgurGramx+"gr");
              balikText.setText("Ton Balığı= "+balikGramx+"gr");
              zeytinyagiText2.setText("Zeyin Yağı= "+zeytinyagi2Gramx+"gr");
              pilavText.setText("Pilav= "+pilavGramx+"gr");
              tavukText.setText("Tavuk Göğsü= "+tavukGramx+"gr");
              zeytinyagiText3.setText("Zeytin Yağı= "+zeytinyagi3Gramx+"gr");
              sebzeText.setText("Sebze");
              salataText.setText("Salata");
              salataText2.setText("Salata");



          }
       else if (rbtnAL.isChecked())
          {
              NumberFormat nf=NumberFormat.getInstance();
              nf.setMaximumFractionDigits(1);

              calorie=calorie+calorie/10;
              carb=calorie/2;
              yag=calorie/4;
              pro=calorie/4;
              yulafCal=carb/5;
              zeytinyagiCal=yag/3;
              yumurtaCal=pro/3;
              bulgurCal=(carb*2)/5;
              balikCal=pro/3;
              zeytinyagi2Cal=yag/3;
              pilavCal=(carb*2)/5;
              tavukCal=pro/3;
              zeytinyagi3Cal=yag/3;


              yulafGram=yulafCal/3.7;
              zeytinyagiGram=zeytinyagiCal/8.7;
              yumurtaGram=yumurtaCal/1.5;
              bulgurGram=bulgurCal/3.4;
              balikGram=balikCal/1.7;
              zeytinyagi2Gram=zeytinyagi2Cal/8.7;
              pilavGram=pilavCal/3.6;
              tavukGram=tavukCal/1.1;
              zeytinyagi3Gram= zeytinyagi3Cal/8.7;


              String yulafGramx=nf.format(yulafGram);
              String zeytinyagiGramx=nf.format(zeytinyagiGram);
              String yumurtaGramx=nf.format(yulafGram);
              String bulgurGramx=nf.format(bulgurGram);
              String balikGramx=nf.format(balikGram);
              String zeytinyagi2Gramx=nf.format(zeytinyagi2Gram);
              String pilavGramx=nf.format(pilavGram);
              String tavukGramx=nf.format(tavukGram);
              String zeytinyagi3Gramx=nf.format(zeytinyagi3Gram);


              yulafText.setText("Yulaf="+yulafGramx+"gr");
              zeytinyagiText.setText("Zeytin Yaği= "+zeytinyagiGramx+"gr");
              yumurtaText.setText("Yumurta= "+yumurtaGramx+"gr");
              bulgurText.setText("Bulgur= "+bulgurGramx+"gr");
              balikText.setText("Ton Balığı= "+balikGramx+"gr");
              zeytinyagiText2.setText("Zeytin Yağı= "+zeytinyagi2Gramx+"gr");
              pilavText.setText("Pilav= "+pilavGramx+"gr");
              tavukText.setText("Tavuk Göğsü= "+tavukGramx+"gr");
              zeytinyagiText3.setText("Zeytin Yağı= "+zeytinyagi3Gramx+"gr");
              sebzeText.setText("Sebze");
              salataText.setText("Salata");
              salataText2.setText("Salata");

          }
          else{
              NumberFormat nf=NumberFormat.getInstance();
              nf.setMaximumFractionDigits(1);
              calorie=calorie;
              carb=calorie/2;
              yag=calorie/4;
              pro=calorie/4;
              yulafCal=carb/5;
              zeytinyagiCal=yag/3;
              yumurtaCal=pro/3;
              bulgurCal=(carb*2)/5;
              balikCal=pro/3;
              zeytinyagi2Cal=yag/3;
              pilavCal=(carb*2)/5;
              tavukCal=pro/3;
              zeytinyagi3Cal=yag/3;


              yulafGram=yulafCal/3.7;
              zeytinyagiGram=zeytinyagiCal/8.7;
              yumurtaGram=yumurtaCal/1.5;
              bulgurGram=bulgurCal/3.4;
              balikGram=balikCal/1.7;
              zeytinyagi2Gram=zeytinyagi2Cal/8.7;
              pilavGram=pilavCal/3.6;
              tavukGram=tavukCal/1.1;

              zeytinyagi3Gram= zeytinyagi3Cal/8.7;


              String zeytinyagiGramx=nf.format(zeytinyagiGram);
              String yulafGramx=nf.format(yulafGram);
              String yumurtaGramx=nf.format(yulafGram);
              String bulgurGramx=nf.format(bulgurGram);
              String balikGramx=nf.format(balikGram);
              String zeytinyagi2Gramx=nf.format(zeytinyagi2Gram);
              String pilavGramx=nf.format(pilavGram);
              String tavukGramx=nf.format(tavukGram);
              String zeytinyagi3Gramx=nf.format(zeytinyagi3Gram);


              yulafText.setText("Yulaf="+yulafGramx+"gr");
              zeytinyagiText.setText("Zeytin Yaği= "+zeytinyagiGramx+"gr");
              yumurtaText.setText("Yumurta= "+yumurtaGramx+"gr");
              bulgurText.setText("Bulgur= "+bulgurGramx+"gr");
              balikText.setText("Ton Balığı= "+balikGramx+"gr");
              zeytinyagiText2.setText("Zeytin Yağı= "+zeytinyagi2Gramx+"gr");
              pilavText.setText("Pilav= "+pilavGramx+"gr");
              tavukText.setText("Tavuk Göğsü= "+tavukGramx+"gr");
              zeytinyagiText3.setText("Zeytin Yağı= "+zeytinyagi3Gramx+"gr");
              sebzeText.setText("Sebze");
              salataText.setText("Salata");
              salataText2.setText("Salata");
          }

            }
        });
    }
}

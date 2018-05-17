package com.example.ecoba.tofit;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class BesinlerDB extends SQLiteOpenHelper {

    public static final String veritabanı_adi="veritabani_besinler";
    public static final String besin_tablo="tbl_besinler";
    public static final int veritabai_versiyonu=1;

    public BesinlerDB(Context context) {
        super(context, veritabanı_adi,null,veritabai_versiyonu);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String sql_BesinTablosuOlusturma="CREATE TABLE"+ besin_tablo+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, BesinAdi TEXT, BesinKalori TEXT, BesinProtein TEXT, BesinLif TEXT, BesinKarb TEXT)";
  db.execSQL(sql_BesinTablosuOlusturma);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    db.execSQL("DROP TABLE IF EXISTS" +besin_tablo);
    }
    public long ekleBesin(Besinler besin)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues cv=new ContentValues();
        cv.put("BesinAdi",besin.getBesinAdi());
        cv.put("BesinKalori",besin.getKalori());
        cv.put("BesinProtein",besin.getProtein());
        cv.put("BesinLif",besin.getLif());
        cv.put("BesinKarb",besin.getKarbonhidrat());
        long id=db.insert(besin_tablo,null,cv);
        return id;

    }
}

package com.example.ecoba.tofit;

public class Besinler {
    private String BesinAdi;
    private int Kalori;
    private int Protein;
    private int Lif;
    private int Karbonhidrat;


    public Besinler(String besinAdi, int kalori, int protein, int lif, int karbonhidrat) {
        BesinAdi = besinAdi;
        Kalori = kalori;
        Protein = protein;
        Lif = lif;
        Karbonhidrat = karbonhidrat;
    }
    public String getBesinAdi() {
        return BesinAdi;
    }

    public void setBesinAdi(String besinAdi) {
        BesinAdi = besinAdi;
    }

    public int getKalori() {
        return Kalori;
    }

    public void setKalori(int kalori) {
        Kalori = kalori;
    }

    public int getProtein() {
        return Protein;
    }

    public void setProtein(int protein) {
        Protein = protein;
    }

    public int getLif() {
        return Lif;
    }

    public void setLif(int lif) {
        Lif = lif;
    }

    public int getKarbonhidrat() {
        return Karbonhidrat;
    }

    public void setKarbonhidrat(int karbonhidrat) {
        Karbonhidrat = karbonhidrat;
    }











}

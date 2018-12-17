package com.wlazly;

public class Bills {
        String marka;
        int rok;
        int cena;
        int wynik;

    @Override
    public String toString() {
        return "Bills{" +
                "marka='" + marka + '\'' +
                ", rok=" + rok +
                ", cena=" + cena +
                ", wynik=" + wynik +
                '}';
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getWynik() {
        return wynik;
    }

    public void setWynik(int wynik) {
        this.wynik = wynik;
    }

    public Bills(String marka, int rok, int cena, int wynik){
        this.marka= marka;
        this.rok=rok;
        this.cena=cena;
        this.wynik=wynik;


    }
}

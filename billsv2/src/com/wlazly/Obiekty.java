package com.wlazly;

public class Obiekty {
   public String nazwa;
    public String data;
     public String nip;
    public   Obiekty(String nazwa, String data, String nip){
        this.nazwa=nazwa;
        this.data=data;
        this.nip=nip;

    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    @Override
    public String toString() {
        return String.valueOf(getNazwa()+","+getData()+","+getNip());
    }
}

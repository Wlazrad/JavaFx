package com.wlazly;

public class Obiekty {
    String nazwa;
    int data;
    int nip;
    Obiekty(String nazwa, int data, int nip){
        this.nazwa=nazwa;
        this.data=data;
        this.nip=nip;

    }

    @Override
    public String toString() {
        return nazwa;
    }
}

package com.wlazly;

public enum Samochod {

    OPEL_CORSA(1998,2),
    FORD_FIESTA(1993,2),
    VW_POLO(2010,4),
    TOYOTA_AVENSIS(2017,4);
    private int rok;
    private int ilDrzwi;

    Samochod(int rok, int ilDrzwi) {
        this.rok = rok;
        this.ilDrzwi = ilDrzwi;

    }

    @Override
    public String toString() {
        return "Samochod{" +
                "rok=" + rok +
                ", ilDrzwi=" + ilDrzwi +
                '}';
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    public int getIlDrzwi() {
        return ilDrzwi;
    }

    public void setIlDrzwi(int ilDrzwi) {
        this.ilDrzwi = ilDrzwi;
    }
}

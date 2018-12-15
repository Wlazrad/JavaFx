package com.wlazly;

public enum Bills {

    BILL1(1111,11),
    BILL2(222,22),
    BILL3(34,34),
    BILL4(424,34);

    private int year;
    private int number;

            Bills(int year, int number){
        this.year = year;
        this.number= number;
            }

    @Override
    public String toString() {
        return super.toString()+"year=" + year +
                ", number=" + number;
    }

    public int getYear() {
        return year;
    }

    public int getNumber() {
        return number;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

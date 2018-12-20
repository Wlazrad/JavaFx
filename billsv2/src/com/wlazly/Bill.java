package com.wlazly;

import java.util.ArrayList;

public class Bill {
    String name1;
    String data1;
    String nip1;
    String name2;
    String data2;
    String nip2;
    boolean close;


    public Bill(String name1, String data1, String nip1, String name2, String data2, String nip2, boolean close) {
        this.name1=name1;
        this.data1=data1;
        this.nip1=nip1;
        this.name2=name2;
        this.data2=data2;
        this.nip2=nip2;
        this.close=close;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getData1() {
        return data1;
    }

    public void setData1(String data1) {
        this.data1 = data1;
    }

    public String getNip1() {
        return nip1;
    }

    public void setNip1(String nip1) {
        this.nip1 = nip1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public String getNip2() {
        return nip2;
    }

    public void setNip2(String nip2) {
        this.nip2 = nip2;
    }

    public boolean isClose() {
        return close;
    }

    public void setClose(boolean close) {
        this.close = close;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "name1='" + name1 + '\'' +
                ", data1='" + data1 + '\'' +
                ", nip1='" + nip1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", data2='" + data2 + '\'' +
                ", nip2='" + nip2 + '\'' +
                ", close=" + close +
                '}';
    }
}



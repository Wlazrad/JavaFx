package com.wlazly;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Bills>lista = new ArrayList<>();
        lista.add(new Bills("merc",60,34,43));
        lista.add(new Bills("merc11",23,324,23));
        lista.add(new Bills("merc22",43,33,53));


            System.out.println(lista.remove(2));
        }
    }


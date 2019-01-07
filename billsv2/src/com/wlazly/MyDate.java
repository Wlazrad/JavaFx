package com.wlazly;

import java.time.LocalDate;

public class MyDate {

    public static String MyDate() {
        LocalDate mydate = LocalDate.now();
        String nowdate =
                mydate.getDayOfMonth() + "."
                        + mydate.getMonth().getValue() + "." + mydate.getYear();

        return nowdate;
    }


}

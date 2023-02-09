package com.internal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NumberOfDaysBetween {
    public int daysBetweenDates(String date1, String date2) {
        LocalDate d1 = LocalDate.parse(date1, DateTimeFormatter.ISO_DATE);
        LocalDate d2 = LocalDate.parse(date2, DateTimeFormatter.ISO_DATE);
        //return Math.abs((int)d1.until(d2, ChronoUnit.DAYS));
        return (int)Math.abs(ChronoUnit.DAYS.between(d1,d2));
    }

    public static void main(String[] args) {
        System.out.println(new NumberOfDaysBetween().daysBetweenDates("1971-06-29","2010-09-23"));
    }
}

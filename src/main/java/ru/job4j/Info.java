package ru.job4j;

import java.util.Calendar;

public class Info {
    public static void main(String[] args) {
        Calendar calendar  = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "." + calendar.get(Calendar.MONTH) + "." + calendar.get(Calendar.YEAR));
    }
}
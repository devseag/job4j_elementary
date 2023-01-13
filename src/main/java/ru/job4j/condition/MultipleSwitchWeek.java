package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Lundi", "Monday" -> 1;
            case "Mardi", "Tuesday" -> 2;
            case "Mercredi", "Wednesday" -> 3;
            case "Jeudi", "Thursday" -> 4;
            case "Vendredi", "Friday" -> 5;
            case "Samedi", "Saturday" -> 6;
            case "Dimanche", "Sunday" -> 7;
            default -> -1;
        };
    }
}
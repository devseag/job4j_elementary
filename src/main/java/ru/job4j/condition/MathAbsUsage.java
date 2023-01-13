package ru.job4j.condition;

public class MathAbsUsage {
    public static void main(String[] args) {
        int i = 10;
        int j = 3;
        int rsl = j - i;
        System.out.println("j - i = " + rsl);
        int abs = Math.abs(rsl);
        System.out.println("|j - i| = " + abs);
    }
}
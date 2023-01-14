package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        System.out.println("ages: " + ages.length);
        System.out.println("surnames: " + surnames.length);
        System.out.println("prices: " + prices.length);
        String[] names = new String[4];
        for (int i = 0; i < names.length; i++) {
            names[i] = "i " + i;
        }
        for (String s: names) {
            System.out.println(s);
        }
    }
}

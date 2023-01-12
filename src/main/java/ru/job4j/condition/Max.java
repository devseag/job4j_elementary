package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int result = left > right ? left : right;
        return result;
    }

    public static int summation(int first, int second) {
        int result = first + second;
        return result;
    }
}
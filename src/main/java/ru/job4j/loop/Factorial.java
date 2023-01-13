package ru.job4j.loop;

public class Factorial {
    public static int calc(int n) {
        int result = 0;
        for (int i = 0; i <= n; i++) {
            if (n == 0) {
                result = 1;
                break;
            } else {
                result = i == 1 ? 1 : i * result;
            }
        }
        return result;
    }
}
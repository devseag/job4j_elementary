package ru.job4j.array;

public class ReverseLoopForArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Elements in desc order: ");
        for (int i = 0; i < numbers.length; i++) {
            int el = numbers[numbers.length - i - 1];
            System.out.println(el);
        }
    }
}
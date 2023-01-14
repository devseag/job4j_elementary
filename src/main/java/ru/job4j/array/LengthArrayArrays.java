package ru.job4j.array;

public class LengthArrayArrays {
    public static void main(String[] args) {
        int[][] numbers = {{1}, {4, 5}, {7, 8, 9}, {3, 5, 7, 9}};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(
                    "Internal Array size: " + numbers[i].length
            );
        }
    }
}
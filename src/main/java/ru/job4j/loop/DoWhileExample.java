package ru.job4j.loop;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int password;
        do {
            System.out.println("Enter pass: ");
            password = scanner.nextInt();
        } while (password != 555);
        System.out.println("Pass is correct!");
    }
}
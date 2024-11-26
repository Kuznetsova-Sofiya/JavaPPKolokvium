package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FibonacciGenerator generator = new FibonacciGenerator();

        System.out.print("Введите натуральное число n: ");
        int n = scanner.nextInt();

        try {
            List<Long> fibonacciNumbers = generator.generateFibonacci(n);
            System.out.println("Первые " + n + " чисел Фибоначчи: " + fibonacciNumbers);
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
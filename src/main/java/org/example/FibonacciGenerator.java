package org.example;

import java.util.ArrayList;
import java.util.List;

public class FibonacciGenerator {

    public List<Long> generateFibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("n должно быть натуральным числом (больше 0)");
        }

        List<Long> fibonacciNumbers = new ArrayList<>(n);
        long a = 0, b = 1;

        for (int i = 0; i < n; i++) {
            fibonacciNumbers.add(a);
            long next = a + b;
            a = b;
            b = next;
        }

        return fibonacciNumbers;
    }
}
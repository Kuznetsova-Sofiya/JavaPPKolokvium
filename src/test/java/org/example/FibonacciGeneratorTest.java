package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciGeneratorTest {

    private final FibonacciGenerator generator = new FibonacciGenerator();

    @Test
    void testGenerateFibonacci_ValidInput() {
        // Тестируем с n = 5
        List<Long> expected = List.of(0L, 1L, 1L, 2L, 3L);
        List<Long> result = generator.generateFibonacci(5);
        assertEquals(expected, result);
    }

    @Test
    void testGenerateFibonacci_ZeroInput() {
        // Тестируем с n = 0, ожидаем исключение
        assertThrows(IllegalArgumentException.class, () -> generator.generateFibonacci(0));
    }

    @Test
    void testGenerateFibonacci_NegativeInput() {
        // Тестируем с отрицательным n, ожидаем исключение
        assertThrows(IllegalArgumentException.class, () -> generator.generateFibonacci(-3));
    }

    @Test
    void testGenerateFibonacci_OneInput() {
        // Тестируем с n = 1
        List<Long> expected = List.of(0L);
        List<Long> result = generator.generateFibonacci(1);
        assertEquals(expected, result);
    }

    @Test
    void testGenerateFibonacci_TwoInput() {
        // Тестируем с n = 2
        List<Long> expected = List.of(0L, 1L);
        List<Long> result = generator.generateFibonacci(2);
        assertEquals(expected, result);
    }
}
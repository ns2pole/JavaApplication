package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    @Test
    void getPrime() {
        assertEquals(2, PrimeNumber.isPrime(1));
        assertEquals(3, PrimeNumber.isPrime(2));
        assertEquals(5, PrimeNumber.isPrime(3));
        assertEquals(11, PrimeNumber.isPrime(4));
        assertEquals(13, PrimeNumber.isPrime(5));
        assertEquals(17, PrimeNumber.isPrime(6));

    }

    @Test
    void isPrime() {
        assertEquals(true, PrimeNumber.isPrime(3));
        assertEquals(true, PrimeNumber.isPrime(5));
        assertEquals(true, PrimeNumber.isPrime(7));
        assertEquals(true, PrimeNumber.isPrime(11));
        assertEquals(true, PrimeNumber.isPrime(13));
        assertEquals(true, PrimeNumber.isPrime(79));
        assertEquals(false, PrimeNumber.isPrime(4));
    }
    @Test
    void generatePrimes() {
        List<Integer> expected1 = new ArrayList<>(Arrays.asList(2, 3, 5));
        assertEquals(expected1, PrimeNumber.generate(3));
        List<Integer> expected2 = new ArrayList<>(Arrays.asList(2, 3, 5, 7, 11, 13));
        assertEquals(expected2, PrimeNumber.generate(6));
    }

}
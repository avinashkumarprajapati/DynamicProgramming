package com.avinash.standardquestions;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Primes {
    public static boolean isPrime(final int number) {
        return number > 1 && IntStream.rangeClosed(2,
                (int) Math.sqrt(number)).noneMatch(divisor -> number
                % divisor == 0);
    }

    private static int nextPrime(final int number) {
        return isPrime(number + 1) ? number + 1 :
                nextPrime(number + 1);
    }

    public static List<Integer> primes(final int count) {
        return Stream.iterate(2, Primes::nextPrime)
                .limit(count)
                .collect(Collectors.<Integer>toList());
    }

    public static void main(String[] args) {
        System.out.println(nextPrime(33));
    }
}

package com.avinash.recursion;


public class FibonacciRecursion {
    public static void main(String[] args) {
        int i = 0, n = 50;
        while (i < n) {
            System.out.print(fibonacci(i) + " ");
            i++;
        }

    }


    static int fibonacci(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        } else {
            return fibonacci(i - 1) + fibonacci(i - 2);
        }
    }
}

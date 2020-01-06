package com.avinash.recursion;

import java.util.HashMap;
import java.util.Map;

/**
 * showing memoization works way faster than recursion
 */
public class FibonacciMemoization {
    static Map<Integer, Integer> memo = new HashMap<>();

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
            if (memo.containsKey(i)) {
                return memo.get(i);
            } else {
                int t1 = fibonacci(i - 1) + fibonacci(i - 2);
                memo.put(i, t1);
                return fibonacci(i - 1) + fibonacci(i - 2);
            }

        }
    }
}

package com.avinash.standardquestions;

import java.util.function.IntUnaryOperator;

public class Sum {
    public static int sum(IntUnaryOperator
                                  func, int a, int b) {
        if (a > b) return 0;
        else {
            return function.apply(a) +
                    sum(function, a + 1, b);
        }
    }

}

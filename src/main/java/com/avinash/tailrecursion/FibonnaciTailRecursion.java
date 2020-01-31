/* package com.avinash.tailrecursion;

import java.math.BigInteger; */
/*
public class FibonnaciTailRecursion {
    public static BigInteger (int x) {
        return fibTailRecHelper(BigInteger.ONE,
                BigInteger.ZERO, BigInteger.valueOf(x).apply());
    }
    public static BigInteger (BigInteger acc1,
                              BigInteger acc2, BigInteger x) {
        if (x.equals(BigInteger.ZERO)) {
            return Recall.done(BigInteger.ONE);
        } else if (x.equals(BigInteger.ONE)) {
            return Recall.done(acc1.add(acc2));
        } else {
            return Recall.call(() -> fibTailRecHelper(acc2,
                    acc1.add(acc2), x.subtract(BigInteger.ONE));
        }
    }
    public static BigInteger (int number) {
        return factTailRecHelper(BigInteger.ONE,
                BigInteger.valueOf(number).apply());
    }
public static Recall<BigInteger>(BigInteger factorial, BigInteger number) {
        if (number.equals(BigInteger.ZERO)) {
            return Recall.done(factTailRec);
        } else if (number.equals(BigInteger.ONE)) {
            return Recall.done(factorial.multiply(number));
        } else {
            return Recall.call(() -> factTailRecHelper(
                    factorial.multiply(number),
                    number.subtract(BigInteger.ONE)));
        }
    }
}
*/
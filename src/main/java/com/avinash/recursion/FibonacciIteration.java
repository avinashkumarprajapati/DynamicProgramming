package com.avinash.recursion;

import java.util.ArrayList;

public class FibonacciIteration {
    public static void main(String[] args) {
        ArrayList<Integer> fib = new ArrayList();
        fib.add(0,0);
        fib.add(1,1);
        int n=10;
        for (int i=2;i<n;i++){
            Integer i1 = fib.get(i - 1);
            Integer i2 =  fib.get(i-2);
            fib.add(i,(i1+i2));
        }
        fib.forEach(c->{
            System.out.print(c+" ");

        });
    }
}

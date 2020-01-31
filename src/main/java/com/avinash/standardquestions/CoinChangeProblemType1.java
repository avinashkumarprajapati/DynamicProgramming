package com.avinash.standardquestions;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/****/
public class CoinChangeProblemType1 {

    public static void main(String[] args) {
        ArrayList<Supplier> arrayList = new ArrayList();
        arrayList.add(() -> "avinash");
        arrayList.add(() -> 1234);
        List<Object> collect = arrayList.stream().flatMap(supplier -> Stream.of(supplier.get())).collect(Collectors.toList());
       // System.out.println(collect);


        AtomicInteger atomicInteger = new AtomicInteger();

        Stream.of(1, 2, 3, 4).forEach(c -> {
                    int x = atomicInteger.incrementAndGet();
                   // System.out.println(x);

                }
        );
        Map<String, String> map = new
                TreeMap<>();
        map.put("alpha", "A");
        map.put("bravo", "B");
        map.put("charlie", "C");
        String s = "alpha-bravo-charlie";
        map.replaceAll(s::replace);
        System.out.println(map);


    }
}

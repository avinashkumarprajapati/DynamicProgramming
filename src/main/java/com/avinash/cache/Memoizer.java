package com.avinash.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;

public class Memoizer<T, U> {
    private Memoizer() {
    }
    public static<T,U>Function<T, U>(final Function<T, U> function)
    {
        final Map<T, U> cache = new ConcurrentHashMap<>();
        return input -> cache.computeIfAbsent(input, function::apply);
    }
}
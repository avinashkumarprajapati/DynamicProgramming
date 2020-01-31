package com.avinash.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Memoizer2 {

    private Memoizer2() {

    }

    public static <T, R> R memoize(final
                           BiFunction<Function<T, R>, T, R> function, final T
                                   input) {
        final Map<T, R> cache = new
                ConcurrentHashMap<>();
        Function<T, R> memoized = new Function<T, R>() {
            @Override
            public R apply(final T input) {
                return cache.computeIfAbsent(input, key ->
                        function.apply(this, key));
            }
        };
        return memoized.apply(input);
    }
}

package com.avinash.tailrecursion;

import java.util.stream.Stream;

@FunctionalInterface
public interface Recall<T> {
    Recall<T> next();

    default boolean isDone() {
        return false;
    }

    default T getValue() {
        throw new
                IllegalStateException();
    }

    default T apply() {
        return Stream.iterate(this, Recall::next)
                .filter(Recall::isDone)
                .findFirst()
                .get()
                .getValue();
    }

    static <T> Recall<T> call(final Recall<T> nextCall) {
        return nextCall;
    }

    static <T> Recall<T> done(final T value) {
        return new Recall<T>() {
            @Override
            public boolean isDone() {
                return true;
            }

            @Override
            public T getValue() {
                return value;
            }

            @Override
            public Recall<T> next() {
                throw new IllegalStateException();
            }
        };
    }
}
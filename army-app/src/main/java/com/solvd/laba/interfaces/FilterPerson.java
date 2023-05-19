package com.solvd.laba.interfaces;

@FunctionalInterface
public interface FilterPerson<T, S> {
    S filter(T t);
}

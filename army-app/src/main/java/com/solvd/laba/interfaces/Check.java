package com.solvd.laba.interfaces;

@FunctionalInterface
public interface Check<T> {
    boolean check(T smth, T smth2);

}

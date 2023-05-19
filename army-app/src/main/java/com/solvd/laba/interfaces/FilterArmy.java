package com.solvd.laba.interfaces;

import java.util.List;

@FunctionalInterface
public interface FilterArmy<T, U> {
    List<T> filter(U u);
}

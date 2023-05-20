package com.solvd.laba.classes;

public class InvalidArgumentException extends Throwable {
    public InvalidArgumentException() {
        System.out.println("You must pass 4 arguments into this app for it to work.");
    }
}

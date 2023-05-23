package com.solvd.laba.classes;

public class InvalidArgumentException extends RuntimeException {
    public InvalidArgumentException() {
        super("You need 4 Arguments passed as parameters to your application. [nation1 name, size, nation2 name, size]");
    }

}

package com.mylab.main;

public class NoArgsException extends Exception{
    public NoArgsException(String message) {
        super(message);
    }
    public String getMessage(){
        System.out.println("Добавь аргументы");
        return null;
    }
}
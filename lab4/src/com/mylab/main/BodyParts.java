package com.mylab.main;

public enum BodyParts {
    HANDS("Руки"),
    NOSE("Нос"),
    TEETH("Зубы"),
    HEAD("Голова"),
    CHEEKS("Щеки");
    private String name;
    BodyParts(String name){
        this.name = name;
    }
    public String getBodyParts() {
        return name;
    }
}

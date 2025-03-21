package com.mylab.main;

public abstract class State {
    private final Person person;
    private String name;
    State(Person person,String name){
        this.person = person;
        this.name = name;

    }
    public String getName(){
        return name;
    }
}

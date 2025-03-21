package com.mylab.main;

public abstract class StateCylinder implements InterfaceChangeStateCylinder {
    private final Cylinder cylinder;
    private String name;
    StateCylinder(Cylinder cylinder,String name){
        this.cylinder = cylinder;
        this.name = name;

    }
    public String getName(){
        return name;
    }
}

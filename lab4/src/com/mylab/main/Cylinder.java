package com.mylab.main;

import java.util.ArrayList;

public class Cylinder extends Containers implements InterfaceChangeStateCylinder {
    private StateCylinder stateCylinder;
    public Cylinder(String name,ArrayList<Item> itemListContainers){
        super(name,itemListContainers);
    }
    public void setStateCylinder(StateCylinder stateCylinder){
        this.stateCylinder = stateCylinder;
    }
}

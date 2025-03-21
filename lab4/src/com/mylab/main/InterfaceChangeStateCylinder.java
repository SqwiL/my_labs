package com.mylab.main;

public interface InterfaceChangeStateCylinder {
    default void changeStateCylinder(Cylinder cylinder,StateCylinder stateCylinder){
        System.out.println(cylinder.getName() + " изменил состояние на " + stateCylinder.getName());
        cylinder.setStateCylinder(stateCylinder);
    }
}

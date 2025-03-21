package com.mylab.main;

public interface InterfaceScatter {
    default void scatter(Item item,Person person){
        System.out.print(" рассыпал ");
        item.belongs(person);
        System.out.println();
    }
}

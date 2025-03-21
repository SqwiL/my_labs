package com.mylab.main;

public interface InterfaceSniff {
    default void sniff(Item item){
        System.out.println(" нюхает " + item.getName());
    }
}

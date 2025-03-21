package com.mylab.main;

public interface InterfaceSayPhrase {
    default void sayPhrase(String[] strings){
        for(String s : strings){
            System.out.println(s);
        }
    }
}

package com.mylab.main;

public interface InterfaceBrush {
    default void brush(BodyParts bodyParts){
        System.out.println(" чистит " + bodyParts.getBodyParts());
    }
}

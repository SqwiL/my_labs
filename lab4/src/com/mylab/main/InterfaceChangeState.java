package com.mylab.main;

public interface InterfaceChangeState {
     default void changeState(Person person,State state){
         System.out.println(person.getName() + " изменил состояние на " + state.getName());
         person.setState(state);
     }
}

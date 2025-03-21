package com.mylab.main;

public class Soap extends Item implements InterfaceSmelling {
    public Soap(String name) {
        super(name);
    }
    private final Smell TYPE = Smell.STRAWBERRY;
    @Override
    public void smell(Person person) {
        this.belongs(person);
        System.out.println( " пахнет " + TYPE.getSmell());
    }
}

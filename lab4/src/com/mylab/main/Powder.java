package com.mylab.main;


public class Powder extends Item implements InterfaceSmelling, InterfaceScatter {
    public Powder(String name){
        super(name);
    }
    @Override
    public void smell(Person person) {
        if(person.getName() == "Скуперфильд"){
            belongs(person);
            System.out.println(" пахнет " + Smell.DRAGS.getSmell());
        }
        else{
            belongs(person);
            System.out.println(" пахнет " + Smell.TIDE.getSmell());
        }
    }
    public void flyUp(){
        System.out.println(getName() + " взлетел вверх. ");
    }
}

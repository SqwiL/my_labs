package com.mylab.main;

import java.util.ArrayList;

public abstract class Person implements InterfaceAddItem,InterfaceSneeze,InterfaceSniff,InterfaceBrush,InterfaceAddBodyParts,InterfaceChangeState {
    private String name;
    private State state;
    private ArrayList<BodyParts> listBodyParts;
    private final ArrayList<Item> list;


    public Person(String name,State state,ArrayList<BodyParts> listBodyParts,ArrayList<Item> list) {
        this.name = name;
        this.state = state;
        this.listBodyParts = listBodyParts;
        this.list = list;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public ArrayList<Item> getList(){
        return list;
    }
    @Override
    public void addBodyParts(BodyParts... bodyParts) throws NoArgsException{
        if(bodyParts.length == 0){
            throw new NoArgsException("NO args");
        }
        else{
            for (BodyParts s : bodyParts) {
                listBodyParts.add(s);
            }
        }
    }

    @Override
    public void addItemList(Item... item)  {
        for (Item s : item) {
                list.add(s);
        }
    }
    public void setState(State state){
        this.state = state;
    }
    public void changePlace(Place place){
        System.out.println(getName() + " отправился в " + place.getName());
    }
    public void putItem(Item item, Containers containers, Person person){
        containers.getList().add(item);
        this.getList().remove(item);
        System.out.print(getName() + " положил ");
        if(item.getName() == "Мыло" || item.getName() == "Порошок") item.belongs(person);
        else System.out.print(item.getName());
        System.out.print(" в ");
        if(containers.getName() == "Полочка"){
            System.out.print(containers.getName() + " рядышком с ");
            item.belongs(person);
            System.out.println();
        }
        else System.out.println(containers.getName());

    }
    public void takeItem(Containers containers, Person person, Item... item){
        for(Item s: item){
            this.getList().add(s);
            containers.getList().remove(s);
            System.out.print(getName() + " взял ");
            if(s.getName() == "кусок Мыла") s.belongs(person);
            else System.out.print(s.getName());
            System.out.print(" из ");
            if(containers.getName() == "Цилиндр" || containers.getName() == "Коробка") containers.belongs(person);
            else System.out.println(containers.getName());
    }
    }
    public void see(Item item,Containers containers,Person person){
        System.out.print(getName() + " смотрит на ");
        item.belongs(person);
        System.out.print(" на " + containers.getName());
        System.out.println();
    }


    public void lather(Item item,Person person,BodyParts ... bodyParts){
        System.out.print(getName() + " намыливать ");
        for (BodyParts s : bodyParts) {
            if (bodyParts.length != 1) {
                System.out.print(" и ");
            }
            System.out.print(s.getBodyParts());
        }
        System.out.print(" взяв ");
        item.belongs(person);
        System.out.println();
    }

}

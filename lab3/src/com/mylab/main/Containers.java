package com.mylab.main;

import java.util.ArrayList;

public abstract class Containers implements InterfaceOwner, InterfaceAddItem {
    private final ArrayList<Item> itemListContainers;
    private String name;
    public Containers(String name,ArrayList<Item> itemListContainers){
        this.name = name;
        this.itemListContainers = itemListContainers;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public ArrayList<Item> getList(){
        return itemListContainers;
    }

    @Override
    public void belongs(Person person){
        if(person.getName() == "Скуперфильд")
            System.out.println("свой " + this.getName());
        else {
            System.out.println(this.getName() + " пренадлежащий " + person.getName());
        }
    }
    @Override
    public void addItemList(Item... args) {
        for(Item s : args) {
            this.itemListContainers.add(s);
        }
    }
}

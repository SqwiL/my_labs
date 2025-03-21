package com.mylab.main;


public abstract class Item implements InterfaceOwner {
    private String name;

    public Item(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public void belongs(Person person){
        if(person.getName() == "Скуперфильд")
            System.out.print("свой " + this.getName());
        else {
            System.out.print(this.getName() + " пренадлежащий " + person.getName());
        }
    }
}

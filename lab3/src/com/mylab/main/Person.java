<<<<<<< HEAD
package com.mylab.main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public abstract class Person implements InterfaceAddItem {
    private String name;
    private Boolean happy;
    private Map<BodyParts,String> mapBodyParts;
    private final ArrayList<Item> list;

    public Person(String name,Boolean happy,Map<BodyParts,String> mapBodyParts,ArrayList<Item> list) {
        this.name = name;
        this.happy = happy;
        this.mapBodyParts = mapBodyParts;
        this.list = list;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void putEnum() {
        mapBodyParts.put(BodyParts.HANDS, "Руки");
        mapBodyParts.put(BodyParts.TEETH, "Зубы");
        mapBodyParts.put(BodyParts.CHEEKS, "Щеки");
        mapBodyParts.put(BodyParts.NOSE, "Нос");
    }

    public ArrayList<Item> getList(){
        return list;
    }

    @Override
    public void addItemList(Item... args) {
        for(Item s : args) {
            list.add(s);
        }
    }
    public void changeHappy(){
        happy = !happy;
    }
    public Map<BodyParts,String> getMap(){
        return mapBodyParts;
    }


    public void putItem(Item item, Containers containers, Person person){
        containers.getList().add(item);
        this.getList().remove(item);
        System.out.print(getName() + " положил ");
        if(item.getName() == "Мыло") item.belongs(person);
        else System.out.print(item.getName());
        System.out.print(" в ");
        if(containers.getName() == "Полочка"){
            System.out.print(containers.getName() + " рядышком с ");
            item.belongs(person);
            System.out.println();
        }
        else System.out.println(containers.getName());

    }
    public void takeItem(Item item,Containers containers,Person person){
        this.getList().add(item);
        containers.getList().remove(item);
        System.out.print(getName() + " взял ");
        if(item.getName() == "кусок Мыла") item.belongs(person);
        else System.out.print(item.getName());
        System.out.print(" из ");
        if(containers.getName() == "Цилиндр") containers.belongs(person);
        else System.out.println(containers.getName());
    }

    public void notice(Item item,Containers containers,Person person){
        System.out.print("Вдруг " + getName() + " заметил на " + containers.getName() + " ");
        item.belongs(person);
        System.out.println();
    }

    public void see(Item item,Person person){
        System.out.print(getName() + " смотрит на ");
        item.belongs(person);
        System.out.println();
    }

    public void lather(Item item,Person person) {
        System.out.print(getName() + " намыливать " + getMap().get(BodyParts.HANDS) + " и "
                + getMap().get(BodyParts.CHEEKS) + " взяв ");
        item.belongs(person);
        System.out.println();
    }

    public void joy(){
        changeHappy();
        System.out.println(getName() + " радуется!");
        changeHappy();
    }

    public void brush(){
        System.out.println(getName() + " чистит " + getMap().get(BodyParts.TEETH));
    }

    public void poke(Item item,Containers containers,Person person){
        System.out.print(getName() + " сует " + item.getName() + " в ");
        containers.belongs(person);
    }
    public void sneeze(){
        System.out.println(getName() + " чихнул.");
    }
    public void sniff(Item item){
        System.out.println(getName() + " нюхает " + item.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
=======
package com.mylab.main;

import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

public abstract class Person implements InterfaceAddItem {
    private String name;
    private Boolean happy;
    private Map<BodyParts,String> mapBodyParts;
    private final ArrayList<Item> list;

    public Person(String name,Boolean happy,Map<BodyParts,String> mapBodyParts,ArrayList<Item> list) {
        this.name = name;
        this.happy = happy;
        this.mapBodyParts = mapBodyParts;
        this.list = list;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void putEnum() {
        mapBodyParts.put(BodyParts.HANDS, "Руки");
        mapBodyParts.put(BodyParts.TEETH, "Зубы");
        mapBodyParts.put(BodyParts.CHEEKS, "Щеки");
        mapBodyParts.put(BodyParts.NOSE, "Нос");
    }

    public ArrayList<Item> getList(){
        return list;
    }

    @Override
    public void addItemList(Item... args) {
        for(Item s : args) {
            list.add(s);
        }
    }
    public void changeHappy(){
        happy = !happy;
    }
    public Map<BodyParts,String> getMap(){
        return mapBodyParts;
    }


    public void putItem(Item item, Containers containers, Person person){
        containers.getList().add(item);
        this.getList().remove(item);
        System.out.print(getName() + " положил ");
        if(item.getName() == "Мыло") item.belongs(person);
        else System.out.print(item.getName());
        System.out.print(" в ");
        if(containers.getName() == "Полочка"){
            System.out.print(containers.getName() + " рядышком с ");
            item.belongs(person);
            System.out.println();
        }
        else System.out.println(containers.getName());

    }
    public void takeItem(Item item,Containers containers,Person person){
        this.getList().add(item);
        containers.getList().remove(item);
        System.out.print(getName() + " взял ");
        if(item.getName() == "кусок Мыла") item.belongs(person);
        else System.out.print(item.getName());
        System.out.print(" из ");
        if(containers.getName() == "Цилиндр") containers.belongs(person);
        else System.out.println(containers.getName());
    }

    public void notice(Item item,Containers containers,Person person){
        System.out.print("Вдруг " + getName() + " заметил на " + containers.getName() + " ");
        item.belongs(person);
        System.out.println();
    }

    public void see(Item item,Person person){
        System.out.print(getName() + " смотрит на ");
        item.belongs(person);
        System.out.println();
    }

    public void lather(Item item,Person person) {
        System.out.print(getName() + " намыливать " + getMap().get(BodyParts.HANDS) + " и "
                + getMap().get(BodyParts.CHEEKS) + " взяв ");
        item.belongs(person);
        System.out.println();
    }

    public void joy(){
        changeHappy();
        System.out.println(getName() + " радуется!");
        changeHappy();
    }

    public void brush(){
        System.out.println(getName() + " чистит " + getMap().get(BodyParts.TEETH));
    }

    public void poke(Item item,Containers containers,Person person){
        System.out.print(getName() + " сует " + item.getName() + " в ");
        containers.belongs(person);
    }
    public void sneeze(){
        System.out.println(getName() + " чихнул.");
    }
    public void sniff(Item item){
        System.out.println(getName() + " нюхает " + item.getName());
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
>>>>>>> f959aaf (lab5)

package com.mylab.main;

import java.util.ArrayList;
import java.util.HashMap;

public class Story {
    public static void main(String[] args) {
        Things things = new Things("Вещи");
        Scooperfield scooperfield = new Scooperfield("Скуперфильд", false, new HashMap<>(), new ArrayList<>());
        scooperfield.putEnum();
        Krabs krabs = new Krabs("Крабс", false, new HashMap<>(), new ArrayList<>());
        Soap soap = new Soap("кусок Мыла");
        scooperfield.addItemList(things);
        Shelf shelf = new Shelf("Полочка", new ArrayList<>());
        shelf.addItemList(soap);
        Cupboard сupboard = new Cupboard("Шкаф", new ArrayList<>());
        scooperfield.putItem(things, сupboard, scooperfield);
        Cylinder cylinder = new Cylinder("Цилиндр", new ArrayList<>());
        cylinder.addItemList(soap);
        scooperfield.takeItem(soap, cylinder, scooperfield);
        soap.smell(scooperfield);
        scooperfield.notice(soap, shelf, krabs);
        scooperfield.putItem(soap, shelf, krabs);
        scooperfield.see(soap, scooperfield);
        scooperfield.see(soap, krabs);
        scooperfield.lather(soap, krabs);
        scooperfield.joy();
        System.out.println("Сэкономил!!!");
        Powder powder = new Powder("Порошок");
        Toothbrush toothbrush = new Toothbrush("Зубная щетка");
        Box box = new Box("Коробка", new ArrayList<>());
        box.addItemList(powder, toothbrush);
        scooperfield.takeItem(toothbrush, box, scooperfield);
        scooperfield.brush();
        scooperfield.poke(toothbrush, box, scooperfield);
        scooperfield.poke(toothbrush, box, krabs);
        System.out.println("Какой пахнет лучше?");
        scooperfield.sniff(powder);
        powder.smell(scooperfield);
        powder.smell(krabs);
        scooperfield.sneeze();
        powder.flyUp();
        System.out.println("Конец истории!");
    }
}


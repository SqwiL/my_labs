package com.mylab.main;

import java.util.ArrayList;


public class Scooperfield extends Person implements InterfaceScatter, InterfaceSayPhrase {
    private String[] phrase = {"Как хорошо, что я встретился с вами", "Я, правда, хотел поговорить сперва\n" +
            "с этими двумя слабоумными Мигой и Жулио, но думаю, что большой\n" +
            "разницы не будет, если поговорю с вами.", "Я даже думаю, что так\n" +
            "будет лучше. Объединившись вместе, мы можем обтяпать выгодное\n" +
            "дельце. Вы меня понимаете?"};

    public Scooperfield(String name, State state, ArrayList<BodyParts> listBodyParts, ArrayList<Item> list) {
        super(name, state, listBodyParts, list);
    }

    public String[] getPhrase() {
        return phrase;
    }

    public void takeOff(BodyParts bodyParts, Containers containers) {
        System.out.println(getName() + " снял с " + bodyParts.getBodyParts() + " " + containers.getName());
    }

    public void thank(Person person) {
        try {
            System.out.println(getName() + " благодарит " + person.getName());
        } catch (NullPointerException e) {
            e.getMessage();
        }
    }

    public void lookAround() {
        class Place {
            private static String name = "Помещение";

            public Place(String name) {
                this.name = name;
            }

            public static String getName() {
                return name;
            }
        }
        System.out.println(getName() + " оглядел " + Place.getName());
    }

    public static class StateFace {
        private String name = "Лицо";

        public void disgust() {
            System.out.println(name + " Изменило состояние на \"Отвращение\"");
        }

        public void smile() {
            System.out.println(name + " Изменило состояние на \"Улыбаться\"");
        }
    }


   /* public static class StateFace {
        private String name = "Лицо";
        public void disgust(){
            System.out.println( name + "Изменило состояние на \"Отврощение\"");
        }
        public void smile(){
            System.out.println( name + "Изменило состояние на \"Улыбаться\"");
        }
    }*/
}


import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class BattleGround {
    public static void main(String args[]) {
        Battle b = new Battle();

        Cacnea p1 = new Cacnea("Larymar", 2);
        Cacturne p2 = new Cacturne("Larymar", 3);
        Dragonair p3 = new Dragonair("Larymar", 2);
        Dragonite p4 = new Dragonite("Я", 1);
        Dratini p5 = new Dratini("Я", 2);
        Palkia p6 = new Palkia("Я" , 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);

        b.go();
    }
}

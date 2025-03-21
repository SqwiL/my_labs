package Moves;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger() {
        super(Type.NORMAL,0,90);// ПОВЫШАЕТ атаку цели на 2 и сбивает ее с толку
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.ATTACK, +2));
        Effect.confuse(p);
    }
    @Override

    protected String describe() {
        return "использует Swagger";
    }

}

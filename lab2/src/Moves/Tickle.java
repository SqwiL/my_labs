package Moves;

import ru.ifmo.se.pokemon.*;

public class Tickle extends StatusMove {
    public Tickle() {
        super(Type.NORMAL,0 ,100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.ATTACK, - 1));
        p.addEffect(new Effect().turns(0).stat(Stat.DEFENSE, - 1));
    }
    @Override

    protected String describe() {
        return "использует Tickle";
    }
}

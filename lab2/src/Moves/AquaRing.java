package Moves;

import ru.ifmo.se.pokemon.*;

public class AquaRing extends StatusMove {
    public AquaRing() {
        super(Type.WATER, 0 , 0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.HP, +1));
    }
    @Override

    protected String describe() {
        return "использует Aqua Ring";
    }
}

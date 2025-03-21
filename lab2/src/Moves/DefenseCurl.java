package Moves;

import ru.ifmo.se.pokemon.*;

public class  DefenseCurl extends StatusMove {
    public DefenseCurl() {
        super(Type.NORMAL,0,0);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.DEFENSE, +1));
    }
    @Override

    protected String describe() {
        return "использует Defense Curl";
    }
}

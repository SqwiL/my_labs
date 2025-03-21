<<<<<<< HEAD
package Moves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20 ,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.HP, +(20/2)));
    }
    @Override

    protected String describe() {
        return "использует Absorb";
    }
}
=======
package Moves;

import ru.ifmo.se.pokemon.*;

public class Absorb extends SpecialMove {
    public Absorb() {
        super(Type.GRASS, 20 ,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().turns(0).stat(Stat.HP, +(20/2)));
    }
    @Override

    protected String describe() {
        return "использует Absorb";
    }
}
>>>>>>> f959aaf (lab5)

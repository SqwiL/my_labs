<<<<<<< HEAD
package Moves;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.FLYING, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).turns(0).stat(Stat.SPECIAL_DEFENSE, - 1));
    }
    @Override

    protected String describe() {
        return "использует Bug Buzz";
    }

}
=======
package Moves;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.FLYING, 90, 100);
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.1).turns(0).stat(Stat.SPECIAL_DEFENSE, - 1));
    }
    @Override

    protected String describe() {
        return "использует Bug Buzz";
    }

}
>>>>>>> f959aaf (lab5)

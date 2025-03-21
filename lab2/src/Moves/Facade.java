<<<<<<< HEAD
package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70 ,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double pow) {
        if (p.getCondition() == Status.POISON ||
                p.getCondition() == Status.BURN ||
                p.getCondition() == Status.PARALYZE) {
                super.applyOppDamage(p,2 * pow);
        }

    }
    @Override

    protected String describe() {
        return "использует Facade";
    }

}
=======
package Moves;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70 ,100);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double pow) {
        if (p.getCondition() == Status.POISON ||
                p.getCondition() == Status.BURN ||
                p.getCondition() == Status.PARALYZE) {
                super.applyOppDamage(p,2 * pow);
        }

    }
    @Override

    protected String describe() {
        return "использует Facade";
    }

}
>>>>>>> f959aaf (lab5)

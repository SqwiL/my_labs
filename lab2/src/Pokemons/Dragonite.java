<<<<<<< HEAD
package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Dragonite extends Dragonair {
    public Dragonite(String name, int level) {
        super(name, level);
        setStats(91, 134, 95, 100, 100, 80);
        addMove(new Absorb());
        setType(Type.DRAGON,Type.FLYING);
    }
}
=======
package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Dragonite extends Dragonair {
    public Dragonite(String name, int level) {
        super(name, level);
        setStats(91, 134, 95, 100, 100, 80);
        addMove(new Absorb());
        setType(Type.DRAGON,Type.FLYING);
    }
}
>>>>>>> f959aaf (lab5)

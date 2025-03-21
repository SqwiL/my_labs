<<<<<<< HEAD
package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Palkia extends Pokemon {
    public Palkia(String name, int level) {
        super(name, level);
        setStats(90, 120, 100, 150, 120, 100);
        setMove(new DefenseCurl(),new Facade(),new AquaRing(),new IceBeam());
        setType(Type.WATER,Type.DRAGON);
    }
}
=======
package Pokemons;

import Moves.*;
import ru.ifmo.se.pokemon.*;

public class Palkia extends Pokemon {
    public Palkia(String name, int level) {
        super(name, level);
        setStats(90, 120, 100, 150, 120, 100);
        setMove(new DefenseCurl(),new Facade(),new AquaRing(),new IceBeam());
        setType(Type.WATER,Type.DRAGON);
    }
}
>>>>>>> f959aaf (lab5)

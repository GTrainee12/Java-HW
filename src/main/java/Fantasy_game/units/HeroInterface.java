package Fantasy_game.units;

import java.util.ArrayList;

public interface  HeroInterface {

    StringBuilder getInfo();

    void step(ArrayList<Hero> team1, ArrayList<Hero> team2);

}

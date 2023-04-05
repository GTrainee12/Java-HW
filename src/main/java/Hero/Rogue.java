package Hero;

public class Rogue extends Hero {
    public Rogue( String name,
                  int attack, int defense, int damage_min, int damage_max,
                  int health, int speed ) {
        super( name, attack, defense, 0, damage_min, damage_max, health, speed, 0, 0 );
    }

    public Rogue( String name ) {
        super( name, 8, 3, 0, 2, 4, 10, 6, 0, 0 );
    }
}

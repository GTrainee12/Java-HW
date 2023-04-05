package Hero;

public class Crossbowman extends Hero {
    public Crossbowman( String name,
                        int attack, int defense, int shots, int damage_min, int damage_max,
                        int health, int speed ) {
        super( name, attack, defense, shots, damage_min, damage_max, health, speed, 0, 0 );
    }

    public Crossbowman( String name ) {
        super( name, 6, 3, 16, 2, 3, 10, 4, 0, 0 );
    }
}

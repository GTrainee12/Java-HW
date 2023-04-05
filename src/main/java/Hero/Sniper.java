package Hero;

public class Sniper extends Hero {
    public Sniper( String name,
                   int attack, int defense, int shots, int damage_min, int damage_max,
                   int health, int speed ) {
        super( name, attack, defense, shots, damage_min, damage_max, health, speed, 0, 0 );
    }

    public Sniper( String name ) {
        super( name, 12, 10, 32, 8, 10, 15, 9, 0, 0 );
    }
}

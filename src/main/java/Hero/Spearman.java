package Hero;

public class Spearman extends Hero {
    public Spearman( String name,
                     int attack, int defense, int damage_min, int damage_max,
                     int health, int speed ) {
        super( name, attack, defense, 0, damage_min, damage_max, health, speed, 0, 0 );
    }

    public Spearman( String name ) {
        super( name, 4, 5, 0, 1, 3, 10, 4, 0, 0 );
    }
}
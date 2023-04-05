package Hero;

public class Peasant extends Hero {
    public Peasant( String name,
                    int attack, int defense, int damage,
                    int health, int speed, int delivery ) {
        super( name, attack, defense, 0, damage, damage, health, speed, delivery, 0 );
    }

    public Peasant( String name ) {
        super( name, 1, 1, 0, 1, 1, 1, 3, 1, 0 );
    }
}

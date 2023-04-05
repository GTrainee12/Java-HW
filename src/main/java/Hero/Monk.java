package Hero;

public class Monk extends Hero {
    public Monk( String name,
                 int attack, int defense, int damage,
                 int health, int speed, int magic ) {
        super( name, attack, defense, 0, damage, damage, health, speed, 0, magic );
    }

    public Monk( String name ) {
        super( name, 12, 7, 0, 4, 4, 30, 5, 0, 1 );
    }
}

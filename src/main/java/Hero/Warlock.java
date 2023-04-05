package Hero;

public class Warlock extends Hero {
    public Warlock( String name,
                    int attack, int defense, int damage,
                    int health, int speed, int magic ) {
        super( name, attack, defense, 0, damage, damage, health, speed, 0, magic );
    }

    public Warlock( String name ) {
        super( name, 17, 12, 0, 5, 5, 30, 9, 0, 1 );
    }
}

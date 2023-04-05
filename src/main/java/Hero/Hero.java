package Hero;

public abstract class Hero implements Comparable<Hero> {
    private String name;

    private int attack;
    private int defense;
    private int shots;
    private int damage_min;
    private int damage_max;
    private int health;
    private int speed;
    private int delivery;
    private int magic;


    public Hero(String name,
                int attack, int defense, int shots, int damage_min, int damage_max,
                int health, int speed, int delivery, int magic) {
        this.name       = name;
        this.attack     = attack;
        this.defense    = defense;
        this.shots      = shots;
        this.damage_min = damage_min;
        this.damage_max = damage_max;
        this.health     = health;
        this.speed      = speed;
        this.delivery   = delivery;
        this.magic      = magic;
    }

    public Hero(String name,
                int attack, int defense, int shots, int damage,
                int health, int speed, int delivery, int magic) {
        this( name, attack, defense, shots, damage, damage, health, speed, delivery, magic);
    }


    public String getName() { return name; }
    public int getAttack()  { return attack; }
    public int getDefense() { return defense; }
    public int getShots()   { return shots; }
    public int getDamage_min()  { return damage_min; }
    public int getDamage_max()  { return damage_max; }
    public int getHealth()  { return health; }
    public int getSpeed()   { return speed; }
    public int getDelivery(){ return delivery; }
    public int getMagic()   { return magic; }


    public void setName(     String name )  { this.name     = name; }
    public void setAttack(   int attack )   { this.attack   = attack; }
    public void setDefense(  int defense )  { this.defense  = defense; }
    public void setShots(    int shots )    { this.shots    = shots; }
    public void setDamageMin(int damage_min){ this.damage_min = damage_min; }
    public void setDamageMax(int damage_max){ this.damage_max = damage_max; }
    public void setHealth(   int health )   { this.health   = health; }
    public void setSpeed(    int speed )    { this.speed    = speed; }
    public void setDelivery( int delivery ) { this.delivery = delivery; }
    public void setMagic(    int magic )    { this.magic    = magic; }


    public String toString() {
        return String.format("\n%s: attack: %d, defense: %d, shots: %d, damage: %d-%d, health: %d, speed: %d, delivery: %d, magic: %d",
                this.name,
                this.attack,
                this.defense,
                this.shots,
                this.damage_min,
                this.damage_max,
                this.health,
                this.speed,
                this.delivery,
                this.magic);
    }

    @Override
    public int compareTo( Hero o ) {

        if ( this.speed < o.speed )
            return 1;
        else if ( this.speed > o.speed )
            return -1;
        else
            return 0;
    }
}
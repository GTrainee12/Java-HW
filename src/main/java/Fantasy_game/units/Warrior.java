package Fantasy_game.units;
public abstract class Warrior extends Hero {

    protected int range;

    public Warrior(String c_name,float hp, int maxHp, int attack, int damageMin, int damageMax, int defense, int speed,int range, int posX, int posY) {
        super(c_name,hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
    }

}
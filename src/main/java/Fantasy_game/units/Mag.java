package Fantasy_game.units;


import java.util.ArrayList;

public abstract class Mag extends Hero {
    protected int mana;
    protected int maxMana;

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        for (Hero human: team1) {
            if (human.hp < human.maxHp & !human.state.equals("Die")) {
                human.getDamage(damageMax);
                return;
            }
        }
    }

    public Mag(String c_name,float hp, int maxHp, int attack, int damageMin, int damageMax, int defense,
               int speed, int mana, int maxMana, int posX, int posY) {
        super(c_name,hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.mana = mana;
        this.maxMana = maxMana;
    }
}

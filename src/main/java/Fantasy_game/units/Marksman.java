package Fantasy_game.units;
import java.util.ArrayList;

public abstract class Marksman extends Hero {
    protected int range;
    protected int ammo;

    protected Marksman(String c_name, float hp, int maxHp, int attack, int damageMin,
                      int damageMax, int defense, int speed, int ammo,
                      int range, int posX, int posY) {
        super(c_name,hp, maxHp, attack, damageMin, damageMax, defense, speed, posX, posY);
        this.range = range;
        this.ammo = ammo;
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        if (state.equals("Die") || ammo == 0) return;
        Hero victim = team2.get(findNearest(team2));
        float damage = (victim.defense - attack)>0 ? damageMin : (victim.defense - attack)<0 ? damageMax : (damageMin+damageMax)/2;
        victim.getDamage(damage);
        for (Hero human: team1) {
            if (human.getInfo().toString().split(":")[0].equals("Militiaman") && human.state.equals("Stand")) {
                human.state = "Busy";
                return;
            }
        }
        ammo--;
    }
    @Override
    public String toString() {
        return name +
                " H:" + Math.round(hp) +
                " D:" + defense +
                " A:" + attack +
                " Dmg:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                " Shots:" + ammo + " " +
                state;
    }

}


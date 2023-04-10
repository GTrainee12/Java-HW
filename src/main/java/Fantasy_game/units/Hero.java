package Fantasy_game.units;

import java.util.ArrayList;
import java.util.Random;

public abstract class Hero implements HeroInterface {

    protected String c_name;
    protected String name;
    protected float hp;
    protected int maxHp;
    protected int attack;
    protected int damageMin;
    protected int damageMax;
    protected int defense;
    protected int speed;
    protected Vector2D coords;
    protected String state;
    protected static int heroCnt;

    public String toString() {
        return c_name +
                name +
                " \u2764:" + Math.round(hp) +
                " \uD83D\uDEE1\uFE0F:" + defense +
                " \u2694:" + attack +
                " \u1f5E1:" + Math.round(Math.abs((damageMin+damageMax)/2)) +
                " " + state;
    }
    public int[] getCoords() {return new int[]{coords.posX, coords.posY};}

    protected Hero(String c_name,float hp, int maxHp, int attack, int damageMin,
                       int damageMax, int defense, int speed, int posX, int posY) {

        this.c_name = c_name;
        this.name = getName();
        this.hp = hp;
        this.maxHp = maxHp;
        this.attack = attack;
        this.damageMin = damageMin;
        this.damageMax = damageMax;
        this.defense = defense;
        this.speed = speed;
        coords = new Vector2D(posX, posY);
        state = "Stand";
        heroCnt++;
    }

    public int getSpeed() { return speed;}
    public float getHp() { return hp;}
    public String getC_name() {return c_name; }




    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {}
    public int findNearest(ArrayList<Hero> team){
        int index = 0;
        double min = Double.MAX_VALUE;
        for (int i = 0; i < team.size(); i++) {
            if(min > coords.getDistance(team.get(i).coords) && !team.get(i).state.equals("Die")) {
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected void getDamage(float damage){
        this.hp -= damage;
        if (hp <= 0) {
            hp = 0;
            state = "Die";
        }
        if (hp > maxHp) hp = maxHp;
    }

    public StringBuilder getInfo() {
        return new StringBuilder("");
    }

    protected String getName(){
        return Nme.values()[new Random().nextInt( Nme.values().length ) ].toString();
    }

}


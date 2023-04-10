package Fantasy_game.units;

public class Archer extends Marksman {
    public Archer(Vector2D coords) {
        super("Archer: ",35.f, 35, 5, 2, 5, 2,
                9, 10, 10, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {

        StringBuilder builder = new StringBuilder();
        return builder.append("Archer: \t").append(Archer.super.name)
                .append("\t| ATK:\t").append(Archer.super.attack)
                .append("\t| HP:\t").append(Archer.super.hp)
                .append(" \t| Arrows:").append(Archer.super.ammo)
                .append("\t|").append("\t| (X.Y) : ").append(Archer.super.coords.posX).append(".").append(Archer.super.coords.posY);
    }
}

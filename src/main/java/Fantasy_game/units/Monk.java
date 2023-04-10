package Fantasy_game.units;

public class Monk extends Mag {
    public Monk(Vector2D coords) {
        super( "Monk: ",25.f, 25, 6, -6, -6, 2,
                7, 5 ,10, coords.posX, coords.posY);

    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Monk: \t").append(Monk.super.name)
                .append("\t| ATK:\t").append(Monk.super.attack)
                .append("\t| HP:\t").append(Monk.super.hp)
                .append(" \t| MP:\t").append(Monk.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Monk.super.coords.posX).append(".").append(Monk.super.coords.posY);
    }
}
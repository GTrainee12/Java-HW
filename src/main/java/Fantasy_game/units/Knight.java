package Fantasy_game.units;

public class Knight extends Warrior {

    public Knight(Vector2D coords) {
        super("Knight: ",50.f, 50, 10, 5, 8, 10,
                6,2, coords.posX, coords.posY);

    }
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Knight: \t").append(Knight.super.name)
                .append("\t| ATK:\t").append(Knight.super.attack)
                .append("\t| HP:\t").append(Knight.super.hp)
                .append("\t|").append("\t| (X.Y) : ").append(Knight.super.coords.posX).append(".").append(Knight.super.coords.posY);
    }
}

package Fantasy_game.units;

public class Spearman extends Warrior {

    public Spearman(Vector2D coords) {
        super( "Spearman: ",60.f, 60, 10, 5, 9, 8,
                7,3, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Spearman: \t").append(Spearman.super.name)
                .append("\t| ATK:\t").append(Spearman.super.attack)
                .append("\t| HP:\t").append(Spearman.super.hp)
                .append(" \t|\t\t\t|").append("\t| (X.Y) : ").append(Spearman.super.coords.posX).append(".").append(Spearman.super.coords.posY);
    }
}

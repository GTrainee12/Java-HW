package Fantasy_game.units;

import java.util.ArrayList;

public class Militiaman extends Hero {
    protected int cartridges;

    public Militiaman(Vector2D coords) {
        super("Militiaman: ",30.f, 30, 2, 1, 2, 2,
                4, coords.posX, coords.posY);
        this.cartridges = 1;
    }

    @Override
    public void step(ArrayList<Hero> team1, ArrayList<Hero> team2) {
        if (!state.equals("Die")) state = "Stand";
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Militiaman: \t").append(Militiaman.super.name)
                .append("\t| ATK:\t").append(Militiaman.super.attack)
                .append("\t| HP:\t").append(Militiaman.super.hp)
                .append(" \t| Arrows: ").append(Militiaman.this.cartridges)
                .append("\t|").append("\t| (X.Y) : ").append(Militiaman.super.coords.posX).append(".").append(Militiaman.super.coords.posY);
    }
}

package Fantasy_game.units;


public class Spectrum extends Mag {


    public Spectrum(Vector2D coords) {
        super("Spectrum: ",25.f, 25, 10, -7, -7, 2,
                7, 5,15, coords.posX, coords.posY);
    }

    @Override
    public StringBuilder getInfo() {
        StringBuilder builder = new StringBuilder();
        return builder.append("Spectrum(Атк.маг): \t").append(Spectrum.super.name)
                .append("\t| ATK:\t").append(Spectrum.super.attack)
                .append("\t| HP:\t").append(Spectrum.super.hp)
                .append(" \t| MP:\t").append(Spectrum.super.mana)
                .append("\t|").append("\t| (X.Y) : ").append(Spectrum.super.coords.posX).append(".").append(Spectrum.super.coords.posY);
    }
}
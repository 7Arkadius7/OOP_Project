public class Sniper extends Archer{

    public Sniper(float hp, int maxHp, int damage, int att, int def, int speed, int shots, int maxShots, float dist, String name) {
        super(hp, maxHp, damage, att, def, speed, shots, maxShots, dist, name);
    }

    @Override
    public String getInfo() {return "Я Лучник";}
}

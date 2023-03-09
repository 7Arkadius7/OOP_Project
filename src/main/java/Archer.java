public abstract class Archer extends Man {

    int shots, maxShots;
    float dist;
    String name;

    public Archer(float hp, int maxHp, int damage, int att, int def, int speed, int shots, int maxShots, float dist, String name) {
        super(hp, maxHp, damage, att, def, speed);
        this.shots = shots;
        this.maxShots = maxShots;
        this.dist = dist;
        this.name = name;
    }

    public float getDist() {return dist;}

}

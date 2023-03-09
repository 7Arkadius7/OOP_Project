public class Warrior extends Man{

    int luck;
    String name;

    public Warrior(float hp, int maxHp, int damage, int att, int def, int speed, int luck, String name) {
        super(hp, maxHp, damage, att, def, speed);
        this.luck = luck;
        this.name = name;
    }
}

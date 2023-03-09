public class XBowMan extends Archer {

    public XBowMan(float hp, int maxHp, int damage, int att, int def, int speed, int shots, int maxShots, float dist, String name) {
        super(hp, maxHp, damage, att, def, speed, shots, maxShots, dist, name);
    }

    public XBowMan(String name) {
        super(150, 150, 12, 5, 3, 22, 22, 3, 5, "Mark");
        super.name = name;
    };

    @Override
    public String getInfo() {return "Я Арбалетчик";}
}

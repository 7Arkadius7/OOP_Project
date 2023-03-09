public class Farmer extends Man{

    String name;

    public Farmer(float hp, int maxHp, int damage, int att, int def, int speed, String name) {
        super(hp, maxHp, damage, att, def, speed);
        this.name = name;
    }

    @Override
    public String getInfo() {return "Я Фермер";}
}

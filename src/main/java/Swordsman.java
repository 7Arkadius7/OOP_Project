public class Swordsman extends Warrior{

    public Swordsman(float hp, int maxHp, int damage, int att, int def, int speed, int luck, String name) {
        super(hp, maxHp, damage, att, def, speed, luck, name);
    }

    public Swordsman (String name) {
        super(150, 150, 12, 5, 3, 22, 22, "Mark");
        super.name = name;
    };

    @Override
    public String getInfo() {return "Я Мечник";}
}

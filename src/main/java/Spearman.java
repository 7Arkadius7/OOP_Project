public class Spearman extends Warrior{

    public Spearman(float hp, int maxHp, int damage, int att, int def, int speed, int luck, String name) {
        super(hp, maxHp, damage, att, def, speed, luck, name);
    }

    @Override
    public String getInfo() {return "Я Копейщик";}
}

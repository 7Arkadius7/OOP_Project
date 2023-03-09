public class Healer extends Magic{

    public Healer(float hp, int maxHp, int damage, int att, int def, int speed, float mana, int maxMana, int treatment, String name) {
        super(hp, maxHp, damage, att, def, speed, mana, maxMana, treatment, name);
    }

    @Override
    public String getInfo() {return "Я Лекарь";}
}

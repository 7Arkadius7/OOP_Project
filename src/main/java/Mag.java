public class Mag extends Magic{

    public Mag(float hp, int maxHp, int damage, int att, int def, int speed, float mana, int maxMana, int treatment, String name) {
        super(hp, maxHp, damage, att, def, speed, mana, maxMana, treatment, name);
    }

    public Mag(String name) {
        super(80,80,10,5,8,3,50,50,7,"Gordon");
    }

    @Override
    public String getInfo() {return "Я Волшебник";}
}

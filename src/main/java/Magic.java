public class Magic extends Man{

    float mana;
    int maxMana, treatment;
    String name;

    public Magic(float hp, int maxHp, int damage, int att, int def, int speed, float mana, int maxMana, int treatment, String name) {
        super(hp, maxHp, damage, att, def, speed);
        this.mana = mana;
        this.maxMana = maxMana;
        this.treatment = treatment;
        this.name = name;
    }

    public float getTreatment() {return treatment;}
}

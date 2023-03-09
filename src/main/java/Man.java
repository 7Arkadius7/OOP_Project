public abstract class Man implements GameInterface{

    private static int manCnt = 10;
    public static int getManCnt() {return manCnt;}

    private float hp;
    public void setHp(float hp) {if (hp>=0) this.hp = hp;}
    public float getHp() {return hp;}
    public int damage, att, def, maxHp, speed;

    public Man(float hp, int maxHp, int damage, int att, int def, int speed) {
        this.hp = hp;
        this.maxHp = maxHp;
        this.damage = damage;
        this.att = att;
        this.def = def;
        this.speed = speed;
        manCnt++;
    }

    @Override
    public void step() {}

    @Override
    public String getInfo() {return "Я человек";}
}

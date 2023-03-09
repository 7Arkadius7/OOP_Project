import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Sniper sniper = new Sniper(40,40,7,9,6,7,25,25,7,"Tor");
        XBowMan xBowMan = new XBowMan(50, 50, 6, 9, 7, 5, 18, 18, 5, "Klaus");
        Mag mag = new Mag(30, 30, 5,5,8,8,50,50,5, "Hulio");
        Healer healer = new Healer(20,20,2,6,3,9,80,80,7,"Jane");
        Swordsman swordsman = new Swordsman(80,80,8,5,5,3,5,"Tom");
        Spearman spearman = new Spearman(75,75,7,4,4,2,4,"Jastin");
        Farmer farmer = new Farmer(10,10,2,2,2,8, "John");

        System.out.println(sniper.getInfo());
        System.out.println(xBowMan.getInfo());
        System.out.println((mag.getInfo()));
        System.out.println((healer.getInfo()));
        System.out.println((swordsman.getInfo()));
        System.out.println((spearman.getInfo()));
        System.out.println((farmer.getInfo()));

    }
    private static String getName() {
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length-1)]);
        return name;
    }
}

package 实训9_10__抽象类接口和多态.饮品;

public class Test {
    public static void main(String[] args) {
        Wine Vodka = new Wine();
        Milk milk = new Milk();

        Drinker drinker = new Drinker();

        System.out.println("喝酒");
        drinker.toDrink(Vodka,"透明无色");
        System.out.println();
        System.out.println("喝奶");
        drinker.toDrink(milk,"草莓味");
    }
}

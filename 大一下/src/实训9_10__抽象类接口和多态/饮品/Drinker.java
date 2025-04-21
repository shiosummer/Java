package 实训9_10__抽象类接口和多态.饮品;

public class Drinker {
    public void toDrink(Drinkable drink, String str){
        drink.drinkAdvice();

        if (drink instanceof Wine) {
            Wine wine = (Wine)drink;
            wine.setColor(str);
            wine.showColor();
        } else if (drink instanceof Milk) {
            Milk milk = (Milk)drink;
            milk.setFlavor(str);
            milk.showFlavor();
        }
    };
}

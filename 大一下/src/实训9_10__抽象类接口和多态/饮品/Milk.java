package 实训9_10__抽象类接口和多态.饮品;

public class Milk implements Drinkable{
    private String flavor;

    public Milk() {
    }

    public void showFlavor() {
        System.out.println("奶的风味："+flavor);
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public void drinkAdvice() {
        System.out.println("======饮用建议======");
        System.out.println("尽快饮用，防止变质");
    }
}

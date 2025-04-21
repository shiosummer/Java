package 实训9_10__抽象类接口和多态.饮品;

public class Wine implements Drinkable{
    private  String color;

    public Wine(){
    }

    public void showColor(){
        System.out.println("酒的颜色:"+color);
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void drinkAdvice() {
        System.out.println("======饮用建议======");
        System.out.println("适度饮酒怡情，过量饮酒伤身");
        System.out.println("开车不喝酒，喝酒不开车");
    }
}

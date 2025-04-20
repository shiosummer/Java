package 实训8_类的继承.Animal;

public class Animal {
    protected String name;
    protected String color;
    protected int footNumber;

    public Animal() {
    }

    public Animal(String name, String color, int footNumber) {
        this.name = name;
        this.color = color;
        this.footNumber = footNumber;
    }

    public void showInfo() {
        System.out.println("动物：" + name);
        System.out.println("颜色:" + color);
        System.out.println("脚的数量：" + footNumber + "只");
    }

    public void move() {
        System.out.println("输出某动物通过飞/跑/游等方式移动身体");
    }
}

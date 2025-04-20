package 实训8_类的继承.Animal;

public class bird extends Animal {
    public bird(String name, String color, int footNumber) {
        super(name, color, footNumber);
    }

    public bird() {
        super("动物");
    }

    @Override
    public void move() {
        System.out.println(name + "通过飞来移动身体");
    }

    public void nest() {
        System.out.println(name + "在树上筑巢");
    }
}

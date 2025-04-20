package 实训8_类的继承.Animal;

public class fish extends Animal {
    private double length;

    public fish(String name, String color, int footNumber,double length) {
        super(name, color, footNumber);
        this.length=length;
    }

    public fish (){
        super("动物");
    }

    @Override
    public void move() {
        System.out.println(name+"通过游来移动身体");
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("身长："+length+"cm");
    }
}

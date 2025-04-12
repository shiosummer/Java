package 实训8_类的继承.Animal;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("蜘蛛", "黑色", 8);
        System.out.println("======Animal类======");
        animal.showInfo();
        animal.move();

        bird parrot = new bird();
        parrot.name="鹦鹉";
        parrot.color="蓝色";
        parrot.footNumber=2;
        System.out.println("======bird类======");
        parrot.showInfo();
        parrot.move();
        parrot.nest();

        fish Shark = new fish("鲨鱼","浅褐色",0,125.5);
        System.out.println("======fish类======");
        Shark.showInfo();
        Shark.move();
    }
}

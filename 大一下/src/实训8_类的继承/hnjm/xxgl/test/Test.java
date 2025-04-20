package 实训8_类的继承.hnjm.xxgl.test;

import 实训8_类的继承.hnjm.xxgl.Animal;
import 实训8_类的继承.hnjm.xxgl.Cat;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal("动物");
        animal.printAnimalType();
        //animal.shout();(无法访问该方法）
        //animal.active();（无法访问该方法）

        Cat cat=new Cat("猫科动物");
        cat.printAnimalType();
        //cat.zhuoShu();(无法访问该方法)
        //cat.shout();(无法访问该方法)
        //cat.active();(无法访问该方法)

        Bird bird = new Bird("鸟类");
        bird.printAnimalType();
        bird.Sing();
        //bird.shout();(无法访问该方法)
        //bird.active();(无法访问该方法)
    }
}

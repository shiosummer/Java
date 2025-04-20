package 实训8_类的继承.hnjm.xxgl.test;

import 实训8_类的继承.hnjm.xxgl.Animal;

public class Bird extends Animal {
    public Bird(String animalType){
        super(animalType);
    }

    public void Sing(){
        System.out.println("鸟儿在歌唱");
    }
}

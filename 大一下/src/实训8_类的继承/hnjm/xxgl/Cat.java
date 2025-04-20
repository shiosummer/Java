package 实训8_类的继承.hnjm.xxgl;

public class Cat extends Animal{
    public Cat(String animalType) {
        super(animalType);
    }

    private void zhuoShu(){
        System.out.println("小猫会捉鼠");
    }
}

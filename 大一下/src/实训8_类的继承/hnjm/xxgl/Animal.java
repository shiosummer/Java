package 实训8_类的继承.hnjm.xxgl;

public class Animal {
    private String animalType;

    public Animal(String animalType) {
        this.animalType = animalType;
    }

    public void printAnimalType(){
        System.out.println("动物类型："+animalType);
    }

    void shout(){
        System.out.println("动物叫声");
    }

    protected void active(){
        System.out.println("动物行走");
    }

    public String getAnimalType() {
        return animalType;
    }
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }
}

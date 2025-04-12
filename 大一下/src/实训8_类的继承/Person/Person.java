package 实训8_类的继承.Person;

public class Person {
    protected String nationality;
    protected String name;

    public Person(String nationality, String name) {
        this.nationality = nationality;
        this.name = name;
    }

    public Person() {
    }

    public void show(){
        System.out.println("姓名："+name);
        System.out.println("国籍："+nationality);
    }

    public void sleep(){
        System.out.println(name+"需要睡觉");
    }
}

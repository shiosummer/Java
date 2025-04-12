package 实训5_循环解决经典问题_方法的定义和使用;

public class sayHello {
    public static void main(String[] args) {
        sayHello_1();
        sayHello_2("郑蔚楠");
        sayHello_3("郑蔚楠",19);
    }

    public static void sayHello_1() {
        System.out.println("Hello!大家好!");
    }

    public static void sayHello_2(String name) {
        System.out.println("Hellow!大家好!我是" + name);
    }

    public static void sayHello_3(String name, int age) {
        System.out.println("Hellow!大家好!我是" + name+"，今年"+age+"岁。");
    }
}

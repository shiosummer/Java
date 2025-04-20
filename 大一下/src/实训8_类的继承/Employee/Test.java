package 实训8_类的继承.Employee;

public class Test {
    public static void main(String[] args) {
        Employee Zhangsan = new Employee("张三", 114514);
        Zhangsan.showInfo();
        Zhangsan.work();
        System.out.println("============");

        Manager Lisi = new Manager("李四", 919810,"后勤部");
        Lisi.showInfo();
        Lisi.work();
        System.out.println("============");

        Chairman Wangwu = new Chairman("王五", 666999);
        Wangwu.showInfo();
        Wangwu.work();
    }
}

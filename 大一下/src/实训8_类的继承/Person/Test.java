package 实训8_类的继承.Person;

public class Test {
    public static void main(String[] args) {
        Person ZhangSan = new Person("中国","张三");
        System.out.println("======个人信息======");
        ZhangSan.show();
        System.out.println("======个人详情======");
        ZhangSan.sleep();


        Student LiSi =new Student("中国","202409010161","李四");
        System.out.println("======学生信息======");
        LiSi.show();
        LiSi.setScore('A');
        System.out.println("======学生信息======");
        LiSi.show();
        System.out.println("======学生详情======");
        LiSi.study();
        LiSi.sleep();
    }
}

package 实训2;
public class 变量自动类型转换 {
    public static void main(String[] args) {
        byte a=10;
        int b;
        float f=12.5f;
        double d;
        b=a;
        d=a+b+f;
        System.out.println(b);
        System.out.println(d);
    }
}

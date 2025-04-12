package 实训2_变量运算符和if语句;
public class 运算符综合 {
    public static void main(String[] args) {
        int a=-3;
        float b=4.0f;
        float x=++a+b++;
        float y=b/a;
        b=b%a;
        System.out.println(a);
        System.out.println(b);
        System.out.println(x);
        System.out.println(y);
    }
}

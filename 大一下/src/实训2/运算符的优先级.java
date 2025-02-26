package 实训2;
public class 运算符的优先级 {
    public static void main(String[] args) {
        int x=1,y;
        y=3>2*x?x++:--x;
        System.out.println(x);
        System.out.println(y);
    }
}

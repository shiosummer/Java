package 实训2_变量运算符和if语句;
public class 比较运算符和逻辑运算符 {
    public static void main(String[] args) {
        int x=3;
        boolean y;
        y=(x>1)&(x<0);
        System.out.println(y);
        y=(x>1)&&(x<0);
        System.out.println(y);
        y=(x>1)|(x<0);
        System.out.println(y);
        y=(x>1)||(x<0);
        System.out.println(y);
    }
}

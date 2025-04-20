package 实训5_循环解决经典问题_方法的定义和使用;

public class 分段函数 {
    public static void main(String[] args) {
        System.out.println("y="+f(-5));
        System.out.println("y="+f(0));
        System.out.println("y="+f(5));
    }

    public static int f(int x) {
        if (x > 0) {
            return (x + 3);
        } else if (x == 0) {
            return 0;
        } else {
            return x * x - 1;
        }
    }
}

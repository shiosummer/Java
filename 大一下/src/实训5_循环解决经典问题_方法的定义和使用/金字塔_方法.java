package 实训5_循环解决经典问题_方法的定义和使用;

public class 金字塔_方法 {
    public static void main(String[] args) {
        print(3);
        print(5);
        print(7);
    }

    public static void print(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = x; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
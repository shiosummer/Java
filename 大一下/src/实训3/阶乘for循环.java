package 实训3;

import java.util.Scanner;

public class 阶乘for循环 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要计算阶乘的数字n:");
        int n = sc.nextInt();
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        sc.close();
        System.out.println("n!="+result);
    }
}

package 实训3_分支语句的使用和简单循环;

import java.util.Scanner;

public class 最大数 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a的值:");
        int a = sc.nextInt();
        System.out.print("请输入b的值:");
        int b = sc.nextInt();
        System.out.print("请输入c的值:");
        int c = sc.nextInt();
        int m;
        m = a > b ? a : b;
        m = c > m ? c : m;
        sc.close();
        System.out.println("三个数中最大值为:" + m);
    }
}

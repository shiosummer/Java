package 实训3_分支语句的使用和简单循环;

import java.util.Scanner;

public class 阶乘while循环 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要计算阶乘的数字n:");
        int n = sc.nextInt();
        int i=0;
        int result=1;
        while (i++ < n) {
            result*=i;
        }
        sc.close();
        System.out.println("n!="+result);
    }
}

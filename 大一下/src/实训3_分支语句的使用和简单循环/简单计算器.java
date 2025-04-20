package 实训3_分支语句的使用和简单循环;

import java.util.Scanner;

public class 简单计算器 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个小数:");
        double a = sc.nextDouble();
        System.out.print("请输入第二个小数:");
        double b = sc.nextDouble();
        System.out.println("请选择操作字符:\n1-----加\n2-----减\n3-----乘\n4-----除");
        int Choice = sc.nextInt();
        switch (Choice) {
            case 1:
                System.out.println(a + "+" + b + "=" + (a + b));
                break;
            case 2:
                System.out.println(a + "-" + b + "=" + (a - b));
                break;
            case 3:
                System.out.println(a + "*" + b + "=" + (a * b));
                break;
            case 4:
                System.out.println(a + "/" + b + "=" + (a / b));
                break;
            default:
                System.out.println("您输入的操作字符有误");
        }
        sc.close();
    }
}

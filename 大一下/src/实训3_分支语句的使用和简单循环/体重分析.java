package 实训3_分支语句的使用和简单循环;

import java.util.Scanner;

public class 体重分析 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入身高(cm):");
        double Height = sc.nextInt();
        System.out.print("请输入体重(kg):");
        double Weight = sc.nextInt();
        double Standard;
        Standard = (Height - 100) * 0.9;
        if (Standard - Weight > 5) {
            System.out.println("体重不足，加强营养");
        } else if (Weight - Standard > 5) {
            System.out.println("体重超重，加强运动");
        } else {
            System.out.println("体重正常，注意保持");
        }
        sc.close();
    }
}

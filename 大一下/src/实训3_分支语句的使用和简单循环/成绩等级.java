package 实训3_分支语句的使用和简单循环;

import java.util.Scanner;

public class 成绩等级 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入成绩:");
        double Score = sc.nextDouble();
        if (Score <= 100 && Score >= 90) {
            System.out.println("成绩:" + Score + ";等级:优秀");
        } else if (Score <= 89 && Score >= 80) {
            System.out.println("成绩:"+Score+";等级:良好");
        } else if (Score <= 79 && Score >= 70) {
            System.out.println("成绩:"+Score+";等级:中等");
        }else if (Score <= 69 && Score >= 60) {
            System.out.println("成绩:"+Score+";等级:及格");
        }else if (Score <= 59 && Score >= 0) {
            System.out.println("成绩:"+Score+";等级:不及格");
        }else {
            System.out.println("您所输入的成绩不在0~100之间");
        }
        sc.close();
    }
}

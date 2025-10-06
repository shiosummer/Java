package 实训10_JavaAPI的使用和异常;

import java.util.Random;
import java.util.Scanner;

public class Random类应用 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int GuessCount = 0;
        int targetNum = random.nextInt(10) + 1;
        int GuessNum;

        System.out.println("===猜字游戏===");
        System.out.println("随机数已生成，请开始猜测");
        do {
            System.out.print("请输入您猜测的数字:");
            GuessNum = sc.nextInt();
            GuessCount+=1;
            if (GuessNum < targetNum) {
                System.out.print("你猜小了再试一次~\n请输入您猜测的数字:");
            }else if (GuessNum > targetNum) {
                System.out.print("你猜大了再试一次~\n请输入您猜测的数字:");
            }else {
                System.out.print("恭喜你，你猜对了，共猜了"+GuessCount+"次");
            }
        } while (GuessNum != targetNum);
        sc.close();
    }
}
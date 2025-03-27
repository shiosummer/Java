package 实训6;

import java.util.Scanner;

public class 二维表 {
    public static void main(String[] args) {
        int[][] array = new int[3][4];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三行四列的整数类型的二维表（用空格或换行符分隔）");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int max = 0,x=0,y=0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max=array[i][j];
                    x=i+1;
                    y=j+1;
                }
            }
        }
        System.out.print(max+"是值最大的元素，");
        System.out.println("在"+x+"行"+y+"列");
        sc.close();
    }
}

package 实训6;

import java.util.Scanner;

public class 对角线M元素和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请确定需要输入的矩阵为M行M列：");
        int M = sc.nextInt();
        int[][] array = new int[M][M];
        System.out.println("请输入一个M行M列的整数类型的二维表（用空格或换行符分隔）");
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        int Sum = 0;
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < M; j++) {
                if (i + j == M - 1) {
                    Sum += array[i][j];
                }else if( i == j ){
                    Sum += array[i][j];
                }
            }
        }
        System.out.println("主副对角线之和为:" + Sum);
        sc.close();
    }
}

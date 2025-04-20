package 实训6_数组的定义和使用;

import java.util.Scanner;

public class 遍历与累加和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array=new double[10];
        for (int i=0;i<array.length;i++){
            System.out.print("请输入第"+(i+1)+"个小数：");
            array[i]=sc.nextDouble();
        }
        sc.close();
        printArr(array);
        System.out.println("数组中所有元素的累加和为"+getSum(array));
    }
    public static void printArr(double[] array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
    public static double getSum(double[] array){
        double sum=0;
        for (int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return sum;
    }
}

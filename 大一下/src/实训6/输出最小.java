package 实训6;

import java.util.Scanner;

public class 输出最小 {
    public static void main(String[] args) {
        int[] array=new int[10];
        Scanner sc=new Scanner(System.in);
        for (int i=0;i<array.length;i++){
            System.out.print("请输入第"+(i+1)+"个元素：");
            array[i]=sc.nextInt();
        }
        sc.close();
        dayinshuzu(array);

        int min=array[0],place=0,origin=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
                place=i;
            }
        }
        array[0]=min;
        array[place]=origin;

        dayinshuzu(array);
    }

    public static void dayinshuzu(int[]array){
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}

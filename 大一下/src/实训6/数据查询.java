package 实训6;

import java.util.Arrays;
import java.util.Scanner;

public class 数据查询 {
    public static void main(String[] args) {
        int array[]= {12,32,57,85,47,86,47,98,46,78};
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入需要查找的数字：");
        int n=sc.nextInt();
        boolean found=false;
        int index=0;
        for(int i=0;i<array.length;i++) {
            if(array[i]==n){
                found=true;
                index=i+1;
                System.out.println("数字"+n+"是数组中的第"+index+"个数。");
                continue;
            }
        }
        if(found==false){
            System.out.println("查无次数");
        }
        sc.close();
    }
}

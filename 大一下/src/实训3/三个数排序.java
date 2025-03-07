package 实训3;

import java.util.Scanner;

public class 三个数排序 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int a = sc.nextInt();
        System.out.print("请输入第二个数:");
        int b = sc.nextInt();
        System.out.print("请输入第三个数:");
        int c = sc.nextInt();
        if (a>b){
            int num = a;
            a = b;
            b = num;
        }
        if (a>c){
            int num = c;
            c = a;
            a = num;
        }
        if (b>c){
            int num = c;
            c = b;
            b = num;
        }
        sc.close();
        System.out.println("排序后输出的结果为"+a+"<"+b+"<"+c);
    }
}

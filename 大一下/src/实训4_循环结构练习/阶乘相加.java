package 实训4_循环结构练习;

import java.util.Scanner;

public class 阶乘相加 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result1=1,result2=0;
        System.out.print("请输入n的值:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                result1=result1*j;
            }
            result2=result2+result1;
            result1=1;
        }
        System.out.println("1!+2!+3!+...+n!="+result2);
        sc.close();
    }
}

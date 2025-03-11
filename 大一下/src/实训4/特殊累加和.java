package 实训4;

import java.util.Scanner;

public class 特殊累加和 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入需要几个数相加:");
        int n = sc.nextInt();
        System.out.print("请输入初始数字:");
        int a = sc.nextInt();
        int s=0,s2 =0;
        for(int i=1;i<=n;i++){
                double s1 = Math.pow(10,(i-1));
                s2+=a*s1;
                s+=s2;
                }
        System.out.println(s);
        sc.close();
            }
        }
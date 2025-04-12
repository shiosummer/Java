package 实训2_变量运算符和if语句;
import java.util.Scanner;
public class 基本输入和输出 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("请输入第一个数:");
        int A=a.nextInt();
        System.out.print("请输入第二个数:");
        int B=a.nextInt();
        System.out.print("请输入第三个数:");
        int C=a.nextInt();
        System.out.println(A+"+"+B+"+"+C+"="+(A+B+C));
        a.close();
    }
}

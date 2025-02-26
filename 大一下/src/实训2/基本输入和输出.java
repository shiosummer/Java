package 实训2;
import java.util.Scanner;
public class 基本输入和输出 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        int A=a.nextInt();
        int B=a.nextInt();
        int C=a.nextInt();
        System.out.println(A+"+"+B+"+"+C+"="+(A+B+C));
        a.close();
    }
}

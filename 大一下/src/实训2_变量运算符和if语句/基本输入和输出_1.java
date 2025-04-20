package 实训2_变量运算符和if语句;
import java.util.Scanner;

public class 基本输入和输出_1 {
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.print("请输入第三个整数:");
        String num=a.nextLine();
        String[] nums=num.split(" ");
        int A=Integer.parseInt(nums[0]);
        int B=Integer.parseInt(nums[1]);
        int C=Integer.parseInt(nums[2]);
        System.out.println(nums[0]+"+"+nums[1]+"+"+nums[2]+"="+(A+B+C));
        a.close();
    }
}

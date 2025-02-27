package 实训2;
import java.util.Scanner;
public class 平年闰年 {
    public static void main(String[] args) {
        Scanner year=new Scanner(System.in);
        System.out.print("请输入需要判断的年份：");
        int Year=year.nextInt();
        if((Year%4==0&&Year%100!=0)|Year%400==0){
            System.out.println(Year+"年是闰年");
        } else {
                System.out.println(Year+"年是平年");
        }
        year.close();
    }
}

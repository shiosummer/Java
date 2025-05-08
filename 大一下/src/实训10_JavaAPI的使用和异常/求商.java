package 实训10_JavaAPI的使用和异常;

import java.util.InputMismatchException;
import java.util.Scanner;

public class 求商 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("请输入被除数：");
            double a = sc.nextDouble();
            System.out.print("请输入除数：");
            double b = sc.nextDouble();

            if(b==0){
                throw new ArithmeticException("除数不能为0");
            }

            double result = a / b;
            System.out.println("计算结果："+a+"÷"+b+"="+result);

        } catch(InputMismatchException e){
            System.out.println("您所输入的数字有误，请重新输入");
        }catch(ArithmeticException e){
            System.out.println("计算错误："+e.getMessage());
        }finally{
            System.out.println("你总能见到我");
            sc.close();
        }
    }
}

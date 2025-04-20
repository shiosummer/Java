package 实训9_10__抽象类接口和多态.汽车租赁;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======车辆加盟======");
        System.out.print("请输入车辆品牌：");
        String brand = sc.nextLine();
        System.out.print("请输入车主姓名：");
        String owner = sc.nextLine();
        System.out.print("请输入车辆等级(高端/中端/低端)：");
        String level = sc.nextLine();
        System.out.print("请输入车牌号：");
        String license = sc.nextLine();
        System.out.print("请输入租赁天数：");
        int days = sc.nextInt();

        RentalCar car = new RentalCar(brand,owner,level,license,days);

        car.cheliangXinxi();
        sc.close();
    }
}

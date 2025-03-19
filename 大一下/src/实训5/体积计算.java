package 实训5;

public class 体积计算 {
    public static void main(String[] args) {
        System.out.println("正方体边长为5时，体积为" + Cube(5));
        System.out.println("长方体长宽高分别为3、4、5时，体积为"+Cuboid(3,4,5));
        System.out.println("圆柱体地面半径为3，高为4时，体积为"+Cylinder(3,4));
    }
    public static double Cube(double a) {
        return a * a * a;
    }
    public static double Cuboid(double a, double b, double c) {
        return a * b * c;
    }
    public static double Cylinder(double a, double h) {
        return 3.14 * a * a * h;
    }
}

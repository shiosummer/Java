package 实训5;

public class 四则运算 {
    public static void main(String[] args) {
        System.out.println("3×0="+getResult(3, 0, "*"));
        System.out.println("17÷2="+getResult(17, 2, "/"));
        System.out.println("4+12="+getResult(4, 12, "+"));
        System.out.println("14-2="+getResult(14, 2, "-"));
    }
    public static Double getResult(double a, double b, String x) {
        switch (x) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                System.out.print("运算符错误\t");
                return null;
        }
    }
}

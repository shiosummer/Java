package 实训7_类的定义与封装static.Calculator;

public class Calculator {
    private double num1;
    private double num2;
    private String option;

    //构造方法
    public Calculator(double num1,double num2,String option) {
        this.num1 = num1;
        this.num2 = num2;
        setOption(option);
    }

    //计算方法
    public double calculate() {
        switch (option) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if (num2 == 0) {
                    System.out.println("错误：除数不能为0");
                    return Double.NaN;
                }
                return num1 / num2;
            default:
                System.out.println("无效的操作符");
                return Double.NaN;
        }
    }

    //封装属性getter setter方法
    public double getNum1() {
        return num1;
    }
    public void setNum1(double num1) {
        this.num1 = num1;
    }
    public double getNum2() {
        return num2;
    }
    public void setNum2(double num2) {
        this.num2 = num2;
    }
    public String getOption() {
        return option;
    }
    public void setOption(String option) {
        if (option == "+" || option == "-" || option == "*" || option == "/") {
            this.option = option;
        } else {
            System.out.println("操作符出错");
        }
    }
}

package 实训7_类的定义与封装static.Calculator;

public class Calculator_test {
    public static void main(String[] args) {
        Calculator s1 =new Calculator(3.14,1.59,"+");
        Calculator s2 =new Calculator(2.59,2.159,"-");
        Calculator s3 =new Calculator(31.85,22.04,"*");
        Calculator s4 =new Calculator(318.3,19.6,"/");
        System.out.println(s1.getNum1()+s1.getOption()+s1.getNum2()+"="+s1.calculate());
        System.out.println(s2.getNum1()+s2.getOption()+s2.getNum2()+"="+s2.calculate());
        System.out.println(s3.getNum1()+s3.getOption()+s3.getNum2()+"="+s3.calculate());
        System.out.println(s4.getNum1()+s4.getOption()+s4.getNum2()+"="+s4.calculate());

        Calculator s5 =new Calculator(3.14,0,"/");
        System.out.println(s5.getNum1()+s5.getOption()+s5.getNum2()+"="+s5.calculate());

        Calculator s6 =new Calculator(3.14,5,")");
    }
}

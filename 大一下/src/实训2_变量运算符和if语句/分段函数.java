package 实训2_变量运算符和if语句;
import java.util.Scanner;
public class 分段函数 {
    public static void main(String[] args) {
        Scanner X=new Scanner(System.in);
        int x=X.nextInt(),y;
        if(x>0){
            y=x+3;System.out.println(y);
        } else if(x<0){
            y=x*x-1;System.out.println(y);
        } else {
            y=0;System.out.println(y);
        }
        X.close();
    }

}

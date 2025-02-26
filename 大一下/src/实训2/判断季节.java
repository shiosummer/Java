package 实训2;
import java.time.Month;
import java.util.Scanner;
public class 判断季节 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        if(month==3|month==4|month==5){System.out.println(month+"月是春季");}
        else if(month==6|month==7|month==8){System.out.println(month+"月是夏季");}
        else if(month==9|month==10|month==11){System.out.println(month+"月是秋季");}
        else if(month==12|month==1|month==2){System.out.println(month+"月是冬季");}
        else {System.out.println("输入的月份错误");}
        sc.close();
        }
    }

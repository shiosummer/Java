package 实训4_循环结构练习;

public class 逢7拍手 {
    public static void main(String[] args) {
        for (int i=1;i<=100;i++){
            int ge=i%10;
            int shi=i/10%10;
            if(i%7==0||ge==7||shi==7){
                System.out.println("过");
            }else {
                System.out.print(i+" ");
            }
        }
    }
}

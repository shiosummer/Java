package 实训3_分支语句的使用和简单循环;

public class 奇数和for循环 {
    public static void main(String[] args) {
        int result=0;
        for (int i=0;i<100;i++){
            if(i++%2==0){
                result+=i;
            }
        }
        System.out.println("100以内所有奇数的和是:"+result);
    }
}

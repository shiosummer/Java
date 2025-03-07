package 实训3;

public class 奇数和while循环 {
    public static void main(String[] args) {
        int i=0;
        int result=0;
        while(i<100){
            if(i%2==0){
               i++;
            }else {
                result+=i++;
            }
        }
        System.out.println("100以内所有奇数的和是:"+result);
    }
}

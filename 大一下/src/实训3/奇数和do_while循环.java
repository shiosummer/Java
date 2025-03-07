package 实训3;

public class 奇数和do_while循环 {
    public static void main(String[] args) {
        int i=0;
        int result=0;
        do {
            if(i++%2==0){
                result+=i;
            }
        }while(i<100);
        System.out.println("100以内所有奇数的和是:"+result);
    }
}

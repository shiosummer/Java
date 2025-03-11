package 实训4;

public class 素数 {
    public static void main(String[] args) {
        int num=0;
        for (int i = 2; i <= 100; i++) {
            int j;
            for (j = 2; j <= i - 1; j++) {
                if (i % j == 0) {
                    break;
                }
            }
            if (j==i){
                System.out.print(i+" ");
                num++;
            }
        }
        System.out.println("\n100以内的素数一共有"+num+"个");
    }
}

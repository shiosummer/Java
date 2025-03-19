package 实训5;

public class 完数 {
    public static void main(String[] args) {
        int i,j;
        System.out.println("1000以内的完数有：");
        for (i=1;i<=1000;i++){
            int sum=0;
            for (j=1;j<i;j++){
                if (i%j==0){
                    sum+=j;
                }
            }
            if (sum==i){
                System.out.println(i);
            }
        }
    }
}

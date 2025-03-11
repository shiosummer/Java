package 实训4;

public class 水仙花数 {
    public static void main(String[] args) {
        for (int i=100;i<=999;i++){
            int ge=i%10,shi=i/10%10,bai=i/10/10%10;
            if(Math.pow(ge,3)+Math.pow(shi,3)+Math.pow(bai,3)==i){
                System.out.print(i+"、");
            }
        }
        System.out.println("是水仙花数");
    }
}

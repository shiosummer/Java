package 实训4;

public class 回文数 {
    public static void main(String[] args) {
        int num=1;
        for (int i=10000;i<=99999;i++){
            int gewei=i%10,shiwei=i/10%10,baiwei=i/10/10%10,
                    qianwei=i/10/10/10%10,wanwei=i/10/10/10/10%10;
            if(gewei==wanwei&&shiwei==qianwei){
                System.out.println(i+"\t"+num);
                num+=1;
                if (num==21){
                    break;
                }
            }
        }
    }
}

package 实训5;

public class 流程 {
    public static void main(String[] args) {
        System.out.println("S=0,i=1经过流程计算结果为"+f(0,1));
    }
    public static int f(int S,int i) {
        S=S+i*i;
        i=i+1;
        if (i>4){
            return S;
        }else
            return f(S,i);
    }
}

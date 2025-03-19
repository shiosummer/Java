package 实训5;

public class 百钱问题_2 {
    public static void main(String[] args) {
        int cock,hen,chick;
        for(cock=0;cock<=100/5;cock++){
            for(hen=0;hen<=100/3;hen++){
                chick=100-cock-hen;
                if (cock*5+hen*3+chick/3==100&&chick%3==0){
                    System.out.println("公鸡" + cock + "只\t母鸡" + hen + "只\t鸡雏" + chick + "只");
                }
            }
        }
    }
}

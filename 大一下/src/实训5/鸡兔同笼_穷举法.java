package 实训5;

public class 鸡兔同笼_穷举法 {
    public static void main(String[] args) {
        int chicken,rabbit;
        for (chicken=0;chicken<=35;chicken++){
            rabbit=35-chicken;
            if(chicken*2+rabbit*4==94){
                System.out.println("鸡有"+chicken+"只");
                System.out.println("兔有"+rabbit+"只");
                break;
            }
        }
    }
}

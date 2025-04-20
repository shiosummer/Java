package 实训5_循环解决经典问题_方法的定义和使用;

public class 鸡兔同笼_循环计数 {
    public static void main(String[] args) {
        int chicken,rabbit;
        for (rabbit =0;rabbit<94/4;rabbit++){
            chicken=35-rabbit;
            if(rabbit*4+chicken*2==94){
                System.out.println("鸡有"+chicken+"只");
                System.out.println("兔有"+rabbit+"只");
                break;
            }
        }
    }
}

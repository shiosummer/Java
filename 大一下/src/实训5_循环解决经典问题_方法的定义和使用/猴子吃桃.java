package 实训5_循环解决经典问题_方法的定义和使用;

public class 猴子吃桃 {
    public static void main(String[] args) {
        int peach = 1, day,peachday1=0,peachday2 = 0;
        for (day = 9; day >= 1; day--) {
            peach = (peach + 1) * 2;
            if (day == 2) {
                peachday2 = peach;
            } else if (day == 1) {
                peachday1 = peach;
            } else {
                continue;
            }
        }
        int peacheat=peachday1-peachday2;
        System.out.println("第一天吃了"+peacheat+"个桃子");
    }
}

package 实训5;

public class 百钱问题_1 {
    public static void main(String[] args) {
        int cock, hen, chick;
        for (cock = 0; cock <= 100; cock++) {
            for (chick = 0; chick <= 100; chick++) {
                for (hen = 0; hen <= 100; hen++) {
                    if (cock + hen + chick == 100 && cock * 5 + hen * 3 + chick / 3 == 100 && chick%3 == 0) {
                        System.out.println("公鸡" + cock + "只\t母鸡" + hen + "只\t鸡雏" + chick + "只");
                    }
                }
            }
        }
    }
}

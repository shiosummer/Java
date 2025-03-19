package 实训4;

public class 图形3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 15; k >= 2 * i - 1; k--) {
                System.out.print(".");
            }
            if (i < 9) {
                System.out.println("*");
            }
        }
    }
}



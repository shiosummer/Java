package 实训4;

public class 图形4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                System.out.print(".");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 5 - 1; i >= 1; i--) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int k = 1; k <= 2 * (i - 1) - 1; k++) {
                System.out.print(".");
            }
            if (i != 1) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
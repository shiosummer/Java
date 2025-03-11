package 实训4;

public class 图形1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 15; k >= 2*i-1; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

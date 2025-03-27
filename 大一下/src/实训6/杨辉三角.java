package 实训6;

public class 杨辉三角 {
    public static void main(String[] args) {
        int[][] triangle = new int[10][];
        for (int i = 0; i < 10; i++) {
                triangle[i] = new int[i+1];
                triangle[i][0] = 1;
                triangle[i][i] = 1;
            for (int j = 1; j < i; j++) {
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

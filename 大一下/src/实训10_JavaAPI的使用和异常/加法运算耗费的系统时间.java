package 实训10_JavaAPI的使用和异常;

public class 加法运算耗费的系统时间 {
        public static void main(String[] args) {
            long startTime = System.nanoTime();
            long sum = 0;
            for (int i = 0; i < 100000000; i++) {
                sum += i;
            }
            long endTime = System.nanoTime();
            long spendTime = endTime - startTime;

            System.out.println("1亿次加法运算结果：");
            System.out.println("计算结果：sum = " + sum);
            System.out.println("耗费时间：" + spendTime + " 纳秒");
            System.out.println("耗费时间：" + (spendTime / 1000000.0) + " 毫秒");
            System.out.println("耗费时间：" + (spendTime / 1000000000.0) + " 秒");
        }
    }

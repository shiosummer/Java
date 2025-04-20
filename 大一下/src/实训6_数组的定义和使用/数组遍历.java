package 实训6_数组的定义和使用;

public class 数组遍历 {
    public static void main(String[] args) {
        int[] array = {8,6,2,3,1,5,7,4};
        System.out.println("该数组第四个元素是："+array[3]);
        System.out.println("该数组最后一个元素是："+array[array.length-1]);

        System.out.println("遍历输出每一个元素：");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        System.out.println("倒序遍历输出每一个元素：");
        for (int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int max=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]>max){
                max=array[i];
            }
        }
        System.out.println("数组中的最大值为："+max);

        int min=array[0];
        for (int i=0;i<array.length;i++){
            if (array[i]<min){
                min=array[i];
            }
        }
        System.out.println("数组中最小值为："+min);
    }
}

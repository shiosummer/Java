package 实训6_数组的定义和使用;

public class 数组排序 {
    public static void main(String[] args) {
        int[] array={6,8,9,7,10,5,1,4,3,2};
        System.out.println("原数组元素的值输出为：");
        print(array);
        System.out.println("\n经过选择排序升序输出为：");
        xuanze(array);
        print(array);
        System.out.println("\n经过冒泡排序降序输出为：");
        maopao(array);
        print(array);
    }
    public static int[] xuanze(int[] array){
        int big,small;
        for(int i=0;i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                int min=array[i];
                if(array[j]<min){
                    big=min;
                    small=array[j];
                    array[j]=big;
                    array[i]=small;
                }
            }
        }
        return array;
    }
    public static int[] maopao(int[]array) {
        int big, small;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    big = array[j + 1];
                    small = array[j];
                    array[j] = big;
                    array[j + 1] = small;
                }
            }
        }
        return array;
    }
    public static void print(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}


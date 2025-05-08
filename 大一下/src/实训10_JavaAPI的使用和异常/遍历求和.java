package 实训10_JavaAPI的使用和异常;

public class 遍历求和 {
    public static void Sum(double[] array)throws Exception{
        if(array==null||array.length==0){
            throw new Exception("数组不能为null或空");
        }
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        System.out.println("数组的元素和为"+sum);
    }

    public static void main(String[] args) {
        double[] array1= {6.5,5.5,4.3,7.7,5};
        double[] array2= {};
        try {
            Sum(array1);
        } catch (Exception e) {
            System.out.println("捕捉异常："+e.getMessage());
        }
        try {
            Sum(array2);
        } catch (Exception e) {
            System.out.println("捕捉异常："+e.getMessage());
        }
    }
}

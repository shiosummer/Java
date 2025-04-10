package 实训7.Rectangle;

public class Rectangle {
    public double width;
    public double length;
    //静态属性count(统计矩形个数)
    public static int count = 0;

    //两个构建方法（无参和全参）
    public Rectangle() {
        count++;
    }
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        count++;
    }

    //输出长宽pwl(),无返回值，无参数
    public void pwl(){
        System.out.println("矩形的长为"+length+"，宽为"+width);
    }
    //获取面积getArea(),返回值类型为double，无参数
    public double getArea(){
        return width*length;
    }
    //获取周长getZc(),返回值类型为double，无参数
    public double getZc(){
        return width*2+length*2;
    }
    //静态方法count()，无返回值，可输出矩形的个数
    public static void count(){
        System.out.println("当前矩形的个数为"+count);
    }
}

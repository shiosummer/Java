package 实训7_类的定义与封装static.Rectangle;

public class Rectangle_test {
    public static void main(String[] args) {

        //创建第一个矩形对象，并输出其长宽周长面积及矩形个数
        Rectangle rect_1 = new Rectangle(5.0, 3.0);
        rect_1.pwl();
        System.out.println("面积为"+rect_1.getArea()+"，周长为"+rect_1.getZc());
        Rectangle.count();
        System.out.println();

        //创建第二个矩形对象，并输出其长宽周长面积及矩形个数
        Rectangle rect_2 = new Rectangle();
        rect_2.length = 7.5;
        rect_2.width = 4.2;
        rect_2.pwl();
        System.out.println("面积为"+rect_2.getArea()+"，周长为"+rect_2.getZc());
        Rectangle.count();
    }
}

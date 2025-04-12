package 实训7_类的定义与封装static.Vehicle;

public class Vehicle_test {
    public static void main(String[] args) {
        //创建第一个交通工具对象
        Vehicle car =new Vehicle("Su7 Ultra",145,4.5);
        car.ShowInfo();
        car.SpeedUp(100);
        car.SpeedDown(100);
        car.SpeedDown(200);
        System.out.println();

        //创建第二个交通工具对象
        Vehicle motorcycles = new Vehicle("川崎h2r",150,1);
        motorcycles.ShowInfo();
        motorcycles.SpeedUp(80);
        motorcycles.SpeedDown(85);
        motorcycles.SpeedDown(200);
    }
}

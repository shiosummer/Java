package 实训7.Vehicle;

public class Vehicle {
    private String name;
    private double speed;
    private double volume;

    public Vehicle(String name, double speed, double volume) {
        this.name = name;
        this.speed = speed;
        this.volume = volume;
    }

    public void ShowInfo() {
        System.out.println("名称：" + name);
        System.out.println("速度:" + speed);
        System.out.println("体积" + volume);
    }

    public void SpeedUp(double increment) {
        speed += increment;
        System.out.println(name+"的速度加速到："+speed+"km/h");
    }

    public void SpeedDown(double decrement) {
        if (speed - decrement>=0) {
            speed -= decrement;
        }else {
            speed=0;
        }
        System.out.println(name+"的速度减速到"+speed+"km/h");
    }
}
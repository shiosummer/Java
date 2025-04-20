package 实训9_10__抽象类接口和多态.公交车出租车收费;

public class Test {
    public static void main(String[] args) {
        Bus bus_Airconditioner = new Bus("空调");
        Bus bus_Common = new Bus("普通");
        bus_Airconditioner.show();
        System.out.println("============");
        bus_Common.show();
        System.out.println("============");

        Taxi taxi_day = new Taxi(31.85,"白天");
        Taxi taxi_night = new Taxi(22.04,"夜间");
        taxi_day.show();
        System.out.println("============");
        taxi_night.show();
    }
}

package 实训9_10__抽象类接口和多态.公交车出租车收费;

public class Taxi implements ShouFei {
    private double distance;
    private String time;

    public Taxi(double distance, String time) {
        this.distance = distance;
        this.time = time;
    }

    @Override
    public double fuFei() {
        if (time=="白天"){
            if (distance<3){
                return 8.00;
            }else {
                return 8+1.5*(distance-3);
            }
        } else if (time=="夜间") {
            if (distance<3){
                return 10.00;
            }else  {
                return 10+1.5*(distance-3);
            }
        }else {
            return Double.NaN;
        }
    }

    @Override
    public void show() {
        System.out.println("计程车里程信息：");
        System.out.println("里程："+distance+"km");
        System.out.println("时间："+time);
        System.out.println("单价：1.5元/km");
        System.out.println("总价："+fuFei()+"元");
    }

    public double getDistance() {
        return distance;
    }
    public void setDistance(double distance) {
        this.distance=distance;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time=time;
    }

}

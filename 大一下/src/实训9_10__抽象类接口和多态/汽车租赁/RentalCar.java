package 实训9_10__抽象类接口和多态.汽车租赁;

public class RentalCar extends Car implements Zulin {
    private int days;

    RentalCar(String brand, String owner, String level, String license, int days) {
        super(brand, owner, level, license);
        this.days = days;
    }


    @Override
    public double jisuanZujin() {
        double pay;
        switch (level) {
            case "高端":
                return ZUJIN_GAO * days;
            case "中端":
                return ZUJIN_ZHONG * days;
            case "低端":
                return ZUJIN_DI * days;
            default:
                return Double.NaN;
        }
    }

    @Override
    public void cheliangXinxi() {
        System.out.println("======车辆信息======");
        System.out.println("品牌：" + brand);
        System.out.println("车主：" + owner);
        System.out.println("等级：" + level);
        System.out.println("车牌：" + license);
        System.out.println("租赁天数："+days);
        System.out.println("总租金："+jisuanZujin());

    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }
}

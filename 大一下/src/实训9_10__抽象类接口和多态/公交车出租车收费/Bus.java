package 实训9_10__抽象类接口和多态.公交车出租车收费;

public class Bus implements ShouFei {
    private String tpye;

    public Bus(String tpye){
        this.tpye = tpye;
    }

    @Override
    public double fuFei() {
        if (tpye == "空调") {
            return 2.00;
        } else if (tpye=="普通") {
            return 1.00;
        }else return Double.NaN;
    }
    @Override
    public void show() {
        System.out.println(tpye+"公交车 收费:"+fuFei()+"元");
    }

    public String gettype(){
        return tpye;
    }
    public void settype(String tpye){
        this.tpye = tpye;
    }
}

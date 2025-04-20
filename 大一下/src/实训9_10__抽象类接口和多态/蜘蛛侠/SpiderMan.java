package 实训9_10__抽象类接口和多态.蜘蛛侠;

public class SpiderMan extends Person implements Spiderable{
    SpiderMan(String name) {
        super(name);
    }

    @Override
    public void mission() {
        System.out.println(name+"的使命是：惩恶扬善，拯救世界");
    }

    @Override
    public void Climb() {
        System.out.println(name+"正在爬墙");
    }
    @Override
    public void Spin() {
        System.out.println(name+"发射蜘蛛丝");
    }
}

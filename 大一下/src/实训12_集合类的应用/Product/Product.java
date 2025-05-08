package 实训12_集合类的应用.Product;

public class Product {
    private String brand;
    private String name;
    private float price;
    private int num;

    //全参构建方法
    public  Product(String brand, String name, float price, int num) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    //输出四个属性值
    public void printProduct(){
        System.out.println("============");
        System.out.println("品牌:"+brand);
        System.out.println("名称:"+name);
        System.out.println("单价:"+price);
        System.out.println("数量:"+num);
    }

    //封装属性
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

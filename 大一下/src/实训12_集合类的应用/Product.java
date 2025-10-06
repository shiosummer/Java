package 实训12_集合类的应用;

import java.util.ArrayList;

public class Product {
    private String brand;
    private String name;
    private float price;
    private int num;

    //全参构建方法
    public Product(String brand, String name, float price, int num) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.num = num;
    }

    //输出四个属性值
    public void printProduct() {
        System.out.println("============");
        System.out.println("品牌:" + brand);
        System.out.println("名称:" + name);
        System.out.println("单价:" + price);
        System.out.println("数量:" + num);
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

class Product_test {
    public static void main(String[] args) {
        //创建ArrayList存储对象
        ArrayList<Product> products = new ArrayList<>();

        //添加4个商品对象
        Product p1 = new Product("百事", "可乐", 3, 20);
        products.add(p1);
        Product p2 = new Product("可口", "可乐", 3, 40);
        products.add(p2);
        Product p3 = new Product("魔爪", "能量饮料", 5, 30);
        products.add(p3);
        Product p4 = new Product("旺仔", "牛奶", 2, 30);
        products.add(p4);

        //遍历输出每个商品信息，并计算总价钱
        float totalPrice = 0;
        for (Product p : products) {
            p.printProduct();
            totalPrice += p.getPrice() * p.getNum();
        }
        System.out.println("============");
        System.out.println("所有商品的总价钱为" + totalPrice);
    }
}


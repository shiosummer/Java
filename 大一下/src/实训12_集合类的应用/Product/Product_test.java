package 实训12_集合类的应用.Product;

import java.util.ArrayList;

public class Product_test {
    public static void main(String[] args) {
        //创建ArrayList存储对象
        ArrayList<Product> products = new ArrayList<>();

        //添加4个商品对象
        Product p1=new Product("百事","可乐",3,20);
        products.add(p1);
        Product p2=new Product("可口","可乐",3,40);
        products.add(p2);
        Product p3=new Product("魔爪","能量饮料",5,30);
        products.add(p3);
        Product p4=new Product("旺仔","牛奶",2,30);
        products.add(p4);

        //遍历输出每个商品信息，并计算总价钱
        float totalPrice=0;
        for (Product p : products) {
            p.printProduct();
            totalPrice+=p.getPrice()*p.getNum();
        }
        System.out.println("============");
        System.out.println("所有商品的总价钱为"+totalPrice);
    }
}

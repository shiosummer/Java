package 实训10_JavaAPI的使用和异常;

import java.util.Scanner;

public class Product {
    private String name;
    private String price;
    private String num;
    private double total;
    public Product(String name, String price, String num) {
        this.name = name;
        this.price = price;
        this.num = num;
    }
    public void showtotal(){
        double Price = Double.parseDouble(price);
        int Num = Integer.parseInt(num);
        total = Price * Num;
        System.out.println("商品"+name+"的总价值是"+total);
    }
}

class ProductTest{
    public static void main(String[] args) {
        Product product1 = new Product("苹果", "5.5", "10");
        Product product2 = new Product("牛奶", "3.2", "5");
        Product product3 = new Product("书本", "25.8", "2");

        System.out.println("=== 商品总价值计算 ===");
        product1.showtotal();
        product2.showtotal();
        product3.showtotal();
    }
}

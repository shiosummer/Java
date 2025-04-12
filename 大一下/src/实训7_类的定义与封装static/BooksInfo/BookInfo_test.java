package 实训7_类的定义与封装static.BooksInfo;

public class BookInfo_test {
    public static void main(String[] args) {
        //构建第一个对象
        BookInfo Book_1=new BookInfo();
        Book_1.setBookName("Python程序设计");
        Book_1.setBookID("9787302550839");
        Book_1.setPublisher("清华大学出版社");
        Book_1.setPrice(59.80);

        //构建第二个对象
        BookInfo Book_2=new BookInfo("Java程序设计","9787302677482","清华大学出版社",69);

        System.out.println("书籍1的信息如下：");
        Book_1.ShowInfo();
        System.out.println();

        System.out.println("书籍2的信息如下：");
        Book_2.ShowInfo();
    }
}

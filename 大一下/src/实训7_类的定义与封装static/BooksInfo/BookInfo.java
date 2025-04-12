package 实训7_类的定义与封装static.BooksInfo;

public class BookInfo {
    private String BookName;
    private String BookID;
    private String Publisher;
    private double Price;

    public BookInfo() {
        //空的
    }

    public BookInfo(String BookName, String BookID, String Publisher, double Price) {
        this.BookName = BookName;
        this.BookID = BookID;
        this.Publisher = Publisher;
        this.Price = Price;
    }

    public void ShowInfo() {
        System.out.println("书名：" + BookName);
        System.out.println("书号：" + BookID);
        System.out.println("出版社：" + Publisher);
        System.out.println("单价：￥" + Price);
    }

    //封装属性
    public String getBookName() {
        return BookName;
    }

    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    public String getBookID() {
        return BookID;
    }

    public void setBookID(String BookID) {
        this.BookID = BookID;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String Publisher) {
        this.Publisher = Publisher;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}

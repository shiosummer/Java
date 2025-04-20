package 实训8_类的继承.Employee;

public class Employee {
    private String name;
    private int indentifier;

    public Employee(String name, int indentifier) {
        this.name = name;
        this.indentifier = indentifier;
    }

    public void work(){
        System.out.println("工作时间：周一至周五，朝九晚五");
    }

    public  void showInfo(){
        System.out.println("姓名："+name);
        System.out.println("职工编号："+indentifier);
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getIndentifier() {
        return indentifier;
    }
    public void setIndentifier(int indentifier) {
        this.indentifier = indentifier;
    }
}

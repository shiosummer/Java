package 实训8_类的继承.Employee;

public class Chairman extends Employee {
    public Chairman(String name, int indentifier) {
        super(name, indentifier);
    }

    @Override
    public void work() {
        System.out.println("董事长主持召开股东大会");
    }
}

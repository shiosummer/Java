package 实训8_类的继承.Employee;

public class Manager extends Employee{
    private String department;

    public Manager(String name, int indentifier, String department) {
        super(name, indentifier);
        this.department = department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("部门："+department);
    }

    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
}

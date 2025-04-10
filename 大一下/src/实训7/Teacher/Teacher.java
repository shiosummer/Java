package 实训7.Teacher;

public class Teacher {
    private static int totalNumber;
    private static String totalName;
    private String name;
    private String depart;
    private String course;

    static {
        totalNumber = 0;
        totalName = "";
    }

    //定义一个带参数的构造方法，在构造方法中将新建教师统计到总人数
    public Teacher(String name, String depart, String course) {
        this.name = name;
        this.depart = depart;
        this.course = course;
        totalNumber++;
    }

    //一个静态方法showTotal()：可显示教师人数和所有教师姓名
    public static void showTotal() {
        System.out.println("教师总人数为：" + totalNumber);
        System.out.println("教师名单：" + totalName);
    }

    //定义一个成员方法submit()，完成教师姓名上报功能，即将教师姓名汇总至静态变量totaleNames中
    public void submit() {
        totalName += name + "、";
    }

    //定义一个方法show，输出对象详细信息。例如：张三在信息系工作，担任计算机课程
    public void show() {
        System.out.println(name+"在"+depart+"工作，担任"+course+"课程");
    }

    //封装普通属性：姓名(name)，系部（depart），课程(course)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDepart() {
        return depart;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}

package 实训12_集合类的应用;

import java.util.ArrayList;

public class Student {
    private String name;
    private String Banji;
    private double score;

    //全参构建方法
    public Student(String name, String Banji, double score) {
        this.name = name;
        this.Banji = Banji;
        if (score >= 0) {
            this.score = score;
        } else {
            System.out.println("成绩有误，请重新输入");
        }
    }

    //无参构建方法
    public Student() {
    }

    //输出姓名班级成绩
    public void printInfo(){
        System.out.println("============");
        System.out.println("姓名:"+name);
        System.out.println("班级:"+Banji);
        System.out.println("成绩:"+score);
    }

    //封装属性
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBanji() {
        return Banji;
    }
    public void setBanji(String Banji) {
        this.Banji = Banji;
    }
    public double getScore() {
        return score;
    }
    public void setScore(double score) {
        if (score >= 0) {
            this.score = score;
        } else {
            System.out.println("成绩有误，请重新输入");
        }
    }
}

class Student_test {
    public static void main(String[] args) {
        //创建ArrayList存储对象
        ArrayList<Student> studentlist = new ArrayList<>();

        //全参构建三个学生对象
        Student s1 = new Student("张三", "计算机1班", 97.2);
        Student s2 = new Student("李四", "计算机1班", 87.9);
        Student s3 = new Student("王五", "计算机1班", 92.6);
        studentlist.add(s1);
        studentlist.add(s2);
        studentlist.add(s3);

        //遍历输出学生信息
        for (Student student : studentlist) {
            student.printInfo();
        }
    }
}

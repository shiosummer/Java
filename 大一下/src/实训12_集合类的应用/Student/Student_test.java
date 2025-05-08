package 实训12_集合类的应用.Student;

import java.util.ArrayList;

public class Student_test {
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

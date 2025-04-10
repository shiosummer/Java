package 实训7.Teacher;

public class Teacher_test {
    public static void main(String[] args) {
        //生成三个教师对象(由deepseek生成的例子)
        Teacher s1=new Teacher("张三", "计算机系", "Java编程");
        Teacher s2 = new Teacher("李四", "数学系", "高等数学");
        Teacher s3 = new Teacher("王五", "英语系", "大学英语");

        s1.submit();
        s2.submit();
        s3.submit();

        s1.show();
        s2.show();
        s3.show();
        System.out.println();

        Teacher.showTotal();
    }
}

package 实训7.Student_2;

public class Student_test {
    public static void main(String[] args) {
        //创建第一个学生对象
        Student Student_1 = new Student("2023001", "张三");
        Student_1.setStudentScores(new double[]{85.5, 92.0, 58.5, 76.0, 88.5});
        Student_1.CheckScores(3);

        System.out.println();

        //创建第二个学生对象
        Student Student_2 = new Student("2023002", "李四", new double[]{72.0, 45.0, 89.5, 60.0, 53.5});
        Student_2.CheckScores(3);
    }
}

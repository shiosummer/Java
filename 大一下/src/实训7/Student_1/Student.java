package 实训7.Student_1;

public class Student {
    private String StudentName;
    private int StudentID;
    private double javaScore;

    public Student(String StudentName, int StudentID, double javaScore) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.javaScore = javaScore;
    }

    public double getJavaScore() {
        return javaScore;
    }

    public void setJavaScore(double javaScore) {
        this.javaScore = javaScore;
    }

    public void CheckForScore() {
        if (javaScore >=60) {
            System.out.println("学生"+StudentName+"不需要补考，Java成绩为："+javaScore+"分");
        }else{
            System.out.println("学生"+StudentName+"需要补考，Java成绩为："+javaScore+"分");
        }
    }
}

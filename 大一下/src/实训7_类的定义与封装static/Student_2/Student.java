package 实训7_类的定义与封装static.Student_2;

public class Student {
    private String StudentName;
    private String StudentID;
    private double[] StudentScores = new double[5];

    //构建对象
    public Student() {
    }
    public Student(String StudentName, String StudentID) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
    }
    public Student(String StudentName, String StudentID, double[] StudentScores) {
        this.StudentName = StudentName;
        this.StudentID = StudentID;
        this.StudentScores = StudentScores;
    }

    //成员方法
    public void CheckScores(int n){
        if (StudentScores[n] < 60) {
            System.out.println("学生："+StudentName+"\n学号："+StudentID+"\n第"+n+"门课的成绩为："+StudentScores[n]+"\n需要补考");
        }else{
            System.out.println("学生："+StudentName+"\n学号："+StudentID+"\n第"+n+"门课的成绩为："+StudentScores[n]+"\n不需要补考");
        }
    }

    //封装三个对象
    public String getStudentName() {
        return StudentName;
    }
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    public double[] getStudentScores() {
        return StudentScores;
    }
    public void setStudentScores(double[] StudentScores) {
        this.StudentScores = StudentScores;
    }
}

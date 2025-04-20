package 实训8_类的继承.Person;

public class Student extends Person{
    private String StudentID;
    private char Score;

    public Student(){
    }

    public Student(String Nationality, String StudentID, String name){
        super(Nationality, name);
        this.StudentID = StudentID;
    }

    public void study(){
        System.out.println(name+"正在学习");
    }

    @Override
    public void show() {
        super.show();
        System.out.println("学号："+StudentID);
        System.out.println("成绩："+Score);
    }

    public String getStudentID() {
        return StudentID;
    }
    public void setStudentID(String StudentID) {
        this.StudentID = StudentID;
    }
    public char getScore() {
        return Score;
    }
    public void setScore(char Score) {
        this.Score = Score;
    }
}

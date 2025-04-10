package 实训7.Student_1;

public class Student_test {
    public static void main(String[] args) {
        Student XiaoHong =new Student("小红",114514,59);
        System.out.println("小红的Java成绩为："+XiaoHong.getJavaScore()+"分");
        XiaoHong.CheckForScore();
        XiaoHong.setJavaScore(85);
        XiaoHong.CheckForScore();
    }
}

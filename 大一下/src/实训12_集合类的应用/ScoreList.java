package 实训12_集合类的应用;

import java.util.ArrayList;

public class ScoreList {
    private String name;
    private double[] score;

    {
        score = new double[3];
    }

    public ScoreList(String name, double[] score) {
        this.name = name;
        this.score = score;
    }

    public void show() {
        System.out.println("============");
        System.out.println("姓名:"+name);
        System.out.print("成绩:");
        double totalScore = 0;
        for (double x : score) {
            System.out.print(x+" ");
            totalScore += x;
        }
        System.out.println();
        if (totalScore < 180) {
            System.out.println("学生未通过考试");
        }else{
            System.out.println("学生通过考试");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }
}

class ScoreList_test {
    public static void main(String[] args) {
        //创建ArrayList存储对象
        ArrayList<ScoreList> scoreLists = new ArrayList<>();

        //创建四个Student对象
        ScoreList s1 = new ScoreList("张三", new double[]{34, 34, 56});
        ScoreList s2 = new ScoreList("李四", new double[]{67, 78, 89});
        ScoreList s3 = new ScoreList("王五", new double[]{67, 89, 66});
        ScoreList s4 = new ScoreList("赵六", new double[]{55, 89, 40});
        scoreLists.add(s1);
        scoreLists.add(s2);
        scoreLists.add(s3);
        scoreLists.add(s4);

        for(ScoreList s: scoreLists){
            s.show();
        }
    }
}

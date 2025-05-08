package 实训12_集合类的应用.Score;

public class Score {
    private String name;
    private double[] score;

    {
        score = new double[3];
    }

    public Score(String name, double[] score) {
        this.name = name;
        this.score = score;
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

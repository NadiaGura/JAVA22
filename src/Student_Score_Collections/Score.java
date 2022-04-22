package Student_Score_Collections;

public class Score {

    String course;
    int scoreValue;

    //getter to get course and to calculate average score per course
    public String getCourse() {
        return course;
    }

    //constructor
    public Score(String course, int scoreValue) {
        this.course = course;
        this.scoreValue = scoreValue;
    }

    //getter to get score value in calculating average course grade
    public int getScoreValue() {
        return scoreValue;
    }
}

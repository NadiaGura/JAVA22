package Student_Score_Collections;

import java.util.ArrayList;

/*
Write a class called Student that has the following properties called name(string), age(int), scores(arrayList<Score>).
Write another class called Score that has the following properties course(string), scoreValue(int)
Add a method to your students class to get the average score of all the courses that a particular student offers.
 */
public class Student {

    String name;
    int age;
    ArrayList<Score> scores;

    //constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        scores = new ArrayList<Score>();
    }

    //getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //METHOD to add score with subjects for a particular student

    public void addCourse(String course, int scoreValue) {
        Score grades = new Score(course, scoreValue);
        scores.add(grades);
    }

    //METHOD to calculate average course grade for particular student

    public void getAverage() {
        int sum = 0;
        double avg = 0;


        for (int i = 0; i < scores.size(); i++) {
            sum += scores.get(i).getScoreValue();// sum score value elements from score ArrayList
        }
        avg = sum / scores.size();
        System.out.println("Average course score for " + getName() + " is " + avg);
    }
}

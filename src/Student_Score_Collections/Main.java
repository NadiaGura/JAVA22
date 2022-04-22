package Student_Score_Collections;

public class Main {

    //MAIN
    public static void main (String [] args){

Student nr1 = new Student("Mike", 15);
Student nr2 = new Student("John",15);

nr1.addCourse("Math",5);
nr1.addCourse("Biology",8);
nr1.addCourse("Arts",4);

nr2.addCourse("Math",10);
nr2.addCourse("Biology", 7);
nr2.addCourse("Arts", 4);

nr1.getAverage();
nr2.getAverage();
    }
}

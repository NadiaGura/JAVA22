package person;

public class Person {

    //define properties or attributes of a person
    private String name;
    private int age;

    private double height;
    private double weight;
    private double bmi;
    /*

    CONSTRUCTOR - utility that allows us to create instance of an object(description created by the class).

    constructor/method - overloading -> way to define multiple constructors/methods.
    with the same name, but must have different method/constructor signatures.

    method/constructor signatures -> number and data type of the parameters and the order in which
    this params are defined.

*/

    public Person(String name, int age, double height, double weight){ //constructor for Person containing name and age
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age =age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
         this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }


    //method that will allow to find the BMI = kg/m^2 of the particular person

//    public Person(double height, double weight) { // constructor for Person containing height and weight
//        this.height = height;
//        this.weight = weight;
//    }

    //GETTERS/SETTERS

    //weight

    public double getWeight() {

        return weight;
    }

    public void setWeight() { //void as not returning anything
        this.weight = weight;
    }

    //height

    public double getHeight() {
        return height;
    }

    public void setHeight() { //void as not returning  anything
        this.height = height;
    }

    //bmi - only getter, don't need setter, as bmi values could not be set, but should be calculated based on the inputted data

    public double getBmi() {
        bmi = weight / Math.pow(height, 2);
        return bmi;
    }
}


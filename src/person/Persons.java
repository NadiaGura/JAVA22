package person;

public class Persons {

    //define properties of the class
    private Person [] people;

    public Persons(Person[]people){
        this.people = people;
    }

    public float getAvAge(){
        float sum = 0; //initialize the sum var.
        for (Person person : people){
            sum += person.getAge();;
        }
        return sum/ people.length; // length of people array
    }
}

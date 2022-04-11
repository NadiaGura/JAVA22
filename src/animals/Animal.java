package animals;
//PARENT
public class Animal {

    String name;
    int numberOfLegs;

    public Animal(String name, int numberOfLegs){
        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }
    //methods
    public void sounds(){
        System.out.println("Sounds are : ");
    }

    public void movements(){
        System.out.println("Animal will ");
    }
}



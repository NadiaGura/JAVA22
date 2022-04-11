package animals;
//CHILD
public class Bird extends Animal {

    String color;
    boolean wings;

    public Bird(String name, int numberOfLegs, String color, boolean wings) {
        super(name, numberOfLegs);
        this.color = color;
        this.wings = wings;
    }


    //method fly()
public void fly(){
    if(this.wings == true){
        System.out.println("This bird can fly.");
    }else{
        System.out.println("This bird can not fly.");
    }
}

    //method sing()
    public void sing(){
        System.out.println("Bird is singing!");
    }
    //method movements() overriding
    public void movements(){
        if(this.wings == true){
            System.out.println("This bird will fly, walk and jump!");
        }else{
            System.out.println("This bird can't fly. Will walk, swim and jump!");
        }
    }
}

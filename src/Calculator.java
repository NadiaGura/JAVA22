import java.util.Scanner;

public class Calculator {
    //MAIN
    public static void main(String[] args) {

        char operator; //variable operator
        Double num1;  //input and result variables
        Double num2;
        Double result;


        Scanner input = new Scanner(System.in); //Scanner class object to be used for user input

        System.out.println("Enter first number"); //asking user for number input
        num1 = input.nextDouble();

        System.out.println("Enter second number");//asking user for second number input
        num2 = input.nextDouble();

        System.out.println("Please input arithmetic operator: +, -, *, / or %"); //asking user for an arithmetic operator input
        operator = input.next().charAt(0);


        switch (operator) { //using switch statement as only one condition is true and there will be no loops or if statements due to previously stated requirements

            //+
            case '+':
                result = num1 + num2;
                System.out.println("Sum is " + result);
                break;

            // -
            case '-':
                result = num1 - num2;
                System.out.println("Minus is" + result);
                break;

            // *
            case '*':
                result = num1 * num2;
                System.out.println("Multiplication is " + result);
                break;

            // /
            case '/':
                result = num1 / num2;
                System.out.println("Division is " + result);
                break;

            // %
            case '%':
                result = num1 % num2;
                System.out.println("Modulo is " + result);
                break;

            //default statement if switch condition is not met -> input data i snot valid
            default:
                System.out.println("Invalid input data, please choose correct operator!");
                break;
        }
    }
}

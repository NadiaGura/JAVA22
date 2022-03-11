public class ClassWork {
    //program will compare two Strings with compareTo() method
    //program will extract substring from a String at a certain indexes with substring()
    //MAIN
    public static void main(String[] args) {
//Task3
//                //1st String
//String line1 = "Hello";
//        //extracting part of the String with substring() method;
//System.out.println(line1.substring(1,4));
//    }
//}
        //TASK4
        // String
        String line1 = "Hello";
        StringBuilder reverseLine = new StringBuilder(); //using String Builder for reverse String

        reverseLine.append(line1.toUpperCase()); //appending Strings with upperCase() method

        reverseLine.reverse();//reverse input

        System.out.println(reverseLine);
    }
}
        //extracting part of the String with substring() method;
//        System.out.println(line1.substring(1,4));
//    }
//}

//        //1st String
//String line1 = "Happy coding!";
//        //2nd String
//String line2 = "Java is an OOP language.";
//        //When comparing Strings if 0 is returned (Strings are equal), <0 || >0 (String object are lexicographically different)
//System.out.println(line1.compareTo(line2));
//    }
//}

//        int n = 4;
//        String line1 = "burp";
//        StringBuilder r = new StringBuilder(line1);
//        for (int i = 0; i < n; i++) {
//            r.insert(3, 'r');
//        }
//
//        System.out.println(r.toString());


        //MAIN
//        int i = 0;
//        int num = 0;
//
//        for (i = 2; i <= 80; i++) { //starting counter from 2, as 2 is the first prime number. Traversing through the for loop
//            int counter = 0; //setting counter
//
//            for (num = i; num >= 1; num--) {
//                if (i % num == 0) {
//                    counter += 1; // counting further
//                }
//            }
//            if (counter == 2) {
//                System.out.println(i); //number is prime
//
//            }
//        }
//    }
//}
//        double height = 1.75;
//        double weight = 65.0;
//        String gender = "Female";
//        int age = 25;
// System.out.println("My height is " + height + "." + '\n' + "My weight is " + weight + "." + '\n' +"My gender is " + gender + "." + '\n' + "My age is "+ age
//  + ".");


//        Scanner scanUser = new Scanner(System.in); //declaring Scanner class object
//
//        //REQUESTING AND ASSESSING HEIGHT, WEIGHT, GENDER, AGE INPUT
//        System.out.println("Please enter your height in meters.");
//        double height = scanUser.nextDouble();
//        System.out.println("Please enter your weight in kilos.");
//        double weight = scanUser.nextDouble();
//        System.out.println("Please enter your gender.");
//        String gender = scanUser.next();
//        System.out.println("Please enter your age in full years.");
//        int age = scanUser.nextInt();


//        System.out.println(6<9 && 9>2);
//        System.out.println(5>9 || 8<3);
//        System.out.println(8==2 && 7>6);

//        int number = 10;
////        for(int i = number; i > 9 && i <= 14; i++){
////            System.out.println(i);
////        }
//        if (number > 9 && number <14 ) {
//            System.out.println(number);
//        } else {
//            System.out.println("Number is not valid.");
//        }
//


//        int i = 1;
//        for (i = 1; i <= 50; i++) {
//            if (i % 2 != 0) {//number is odd
//                System.out.println(i + " - odd number");
//            } else { //else statement, number is !odd -> is even
//                System.out.println(i + " - even number");
//            }
//        }


//        int i = 1;
//        while (i <= 50) { //while condition is true
//            if (i % 4 == 0) { //checking whether condition is met
//                System.out.println(i);
//                i++; //incrementing to continue traversing
//            } //counter++
//            else { //else condition, continue traversing
//                i++;
//            }
//        }

//        int i = 1;
//        for( i =1; i <= 50; i++){
//            //System.out.println(i);
//            if(( i%3 ==0 ) && ( i%7 == 0 )){
//                System.out.println("FizzBuzz");
//            } else if(i%3 == 0){
//                System.out.println("Fizz");
//            } else if(i%7 == 0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }




//        String word = "Physician"; //String as a base case for counting letters,traversing
//        int counter = 0; //setting counter to 0
//        for (int i = 0; i < word.length(); i++) { //iterating through the length of the String
//            if ('i' == word.charAt(i)) { //performing condition of increasing the counter while traversing the String length and certain condition is met (identifying letter)
//                counter++;
//            }
//        }
//        System.out.println("Counter of letter 'i' = " + counter);

//        Write a program to compare two strings by their length and return output that tells the user if the strings are equal or not.
//        Write a program to add as many 'r's to 'burp' by using a variable to regulate. For example, if that variable is set to 4, then it will return an output like 'burrrrp'.
//                Write a program to remove the first and last letters of a string. e.g. hello becomes ell.
//                Write a program to reverse a string and capitalize all the letters. e.g. hello becomes OLLEH.
//    }
//}


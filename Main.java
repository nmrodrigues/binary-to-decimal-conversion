import java.util.ArrayList;
import java.util.Scanner;

public class Main<T extends Comparable<T>> { // will use generics
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // allows input frm user
        boolean binarytoDecimal = false; // setting binaryToDecimal to false - has not been converted yet
        while (!binarytoDecimal)  // while the binaryToDecimal is false - while has not been converted
        {
            try {
                System.out.println("Enter a binary string to convert: "); // prompts user for input
                String stringToConvert = input.next(); // gets input string frm user
                int decimalValueOfString = BinaryToDecimal.binaryToDecimal(stringToConvert); // converts the string to decimal
                binarytoDecimal = true; // setting the boolean to true
                System.out.println("The decimal value of " + stringToConvert + " is " + decimalValueOfString);
            } catch (BinaryFormatException ex) // if exception was found
            {
                System.out.println(ex); // print the exception
            }
        }
        ArrayList<Integer> listOfInts = new ArrayList<Integer>(); // creates a new list of Integers
        listOfInts.add(24); // adds 24 to the arrayList
        listOfInts.add(3); // adds 3 to the ArrayList
        listOfInts.add(4); // adds 4 to the arrayList
        listOfInts.add(90); // adds 4 to the arrayList
        listOfInts.add(45); // adds 4 to the arrayList
        listOfInts.add(464); // adds 4 to the arrayList


        System.out.println("The unsorted list is: " + listOfInts); // prints the unsorted list
        ArrayListHandler.ArrayListSort(listOfInts); // sorts the list
        System.out.println("The sort list is: " + listOfInts); // prints the sorted list
        System.out.println("Checking if 1 is in the ArrayList: " + ArrayListHandler.searchTheArray(listOfInts, 0, (listOfInts.size() - 1), 1)); // checking if 1 is in the arraylist
        System.out.println("Checking if 24 is in the ArrayList: " + ArrayListHandler.searchTheArray(listOfInts, 0, (listOfInts.size() - 1), 24)); // checking if 24 is in the arraylist

        ArrayList<Double> listOfDoubles = new ArrayList<Double>(); // creates a new list of Doubles
        listOfDoubles.add(10.0); // adds 24 to the arrayList
        listOfDoubles.add(2.3); // adds 3 to the ArrayList
        listOfDoubles.add(9.2); // adds 4 to the arrayList
        listOfDoubles.add(1.2); // adds 4 to the arrayList
        listOfDoubles.add(5.3); // adds 4 to the arrayList
        listOfDoubles.add(1.5); // adds 4 to the arrayList


        System.out.println("The unsorted list is: " + listOfDoubles); // prints the unsorted list
        ArrayListHandler.ArrayListSort(listOfDoubles); // sorts the list
        System.out.println("The sorted list is: " + listOfDoubles); // prints the sorted list
        System.out.println("Checking if 1.2 is in the ArrayList: " + ArrayListHandler.searchTheArray(listOfDoubles, 0, (listOfDoubles.size() - 1), 1.2)); // checking if 1.2 is in the arraylist
        System.out.println("Checking if 24.2 is in the ArrayList: " + ArrayListHandler.searchTheArray(listOfDoubles, 0, (listOfDoubles.size() - 1), 24.2)); // checking if 24.2 is in the arraylist

        ArrayList<String> listOfString = new ArrayList<String>(); // creates a new list of Strings
        listOfString.add("Nicole"); // adds 24 to the arrayList
        listOfString.add("Computer"); // adds 3 to the ArrayList
        listOfString.add("Hello"); // adds 4 to the arrayList
        listOfString.add("Monday"); // adds 4 to the arrayList


        System.out.println("The unsorted list is: " + listOfString); // prints the unsorted list
        ArrayListHandler.ArrayListSort(listOfString); // sorts the list
        System.out.println("The sorted list is: " + listOfString); // prints the sorted list
        System.out.println("Checking if Nicole is in the ArrayList: " + ArrayListHandler.searchTheArray(listOfString, 0, (listOfString.size() - 1), "Hello")); // checking if 1.2 is in the arraylist
        System.out.println("Checking if Dallas is in the ArrayList: " + ArrayListHandler.searchTheArray(listOfString, 0, (listOfString.size() - 1), "Dallas")); // checking if 24.2 is in the arraylist


    }
}

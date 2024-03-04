import java.io.*;
import java.util.Scanner;

public class javaArray {;
    /**
     * Java Arrays
     *
     *  what is an Array?
     *  Suppose we have three variables of type int with different identifiers for each variable.
     *
     *  Int number1;
     *  Int number2;
     *  Int number3;
     *
     *  number1 = 1;
     *  number2 = 2;
     *  number3 = 3;
     *
     *  As you can see, it seems like a tedious task in order to just initialize and use the variables especially if they are for the same purpose.
     *
     *  In Java and other programming languages, there is one capability wherein we can use one variable to store a list of variable is called an array,
     *
     *  An Array stores multiple data items of the same data type, in a continuous block of memory, divided into a number of slots.
     *
     *  Declaration of an Array
     *
     *  Declaring Array
     *
     *  To declare an Array, write the data type, followed by a set of square brackets [], followed by the identifier name.
     *
     *  For example: int() ages; or int ages[];
     *
     *  Instantiation of an Array
     *
     *  Array Instantiation
     *
     *  After declaring, we must create the array and specify its length with a constructor statement.
     *  Definition:
     *  Instantiation -> In Java, this means creation.
     *  Constructor -> In order to instantiate an object, we need to use a constructor for this. A constructor is a method that is called to create a certain object.
     *
     *  To instantiate (or create an array), write the 'new' keyword followed by the square brackets containing the number of items elements you want the array to have.
     *
     */

    public static void main(String[] args) {
        // for example:
        // declaration
        int ages[];

        // instantiate object
        ages = new int[100];

        // or, can also be written as:

        // declare and instantiate object
        // int ages[] = new int[100];

        // You can also instantiate an Array by directly initializing it with data
        // for example
        int[] arr = {1, 2, 3, 4, 5};

        // The statement above declares and instantiate an array of integers with five elements (initialized to the values 1, 2, 3, 4, and 5)

        // boolean array
        boolean[] results = {true, false, true, false};

        // double array
        double[] grades = {100, 90, 80, 75};

        // string array
        String[] days = {"Mon", "Tue", "Wed", "Thur", "Fri", "Sat", "Sun"};

        // Accessing Array element
        // To access an array element or part of the array, you use a number called an 'index' or a 'subscript'
        // index number or subscript:
        // -> is assigned to each number of the array. to allow the program to access an individual number of the array.
        // -> begins with zero and progress sequentially by whole numbers to the end of the array.
        // NOTE: Elements inside your array are from 0 to (sizeOfArray - 1)

        // For Example: given the array we declare a while ago, we have

        // assigns 10 to the first element in the array
        ages[0] = 10;

        // prints the last element in an array
        System.out.println(ages[99]);

        // NOTE: Once an array is declared and constructed, the store value of each member of the array will be initialized to zero for number data type.
        // For Reference data types like String, they are NOT initialized to blanks or an empty string "". Therefore, you must populate the string array explicitly.

        // Example
        // The following is a sample code on how to print all the elements in the array. It uses a for loop -> print all the elements of ages[]

        for (int h = 0; h < ages.length; h++) {
            System.out.println(ages[h]);
        }

        // Write a java program that will ask the user to enter 5 student names and store them in an array. Then output all the names using a for loop

        // Create a scanner
        Scanner sc = new Scanner(System.in);

        // create an empty array to store the 5 names
        String[] studentNames = new String[5];

        // Prompt the user to enter the 5 names

        for (int idx = 0; idx < studentNames.length; idx++) {
            System.out.println("Enter the name of students " + (idx + 1) + " ");
            studentNames[idx] = sc.next();
        }
        System.out.println("==================================================");


        // output the names
        for (int l = 0; l < studentNames.length; l++) {
            System.out.println(studentNames[l]);
        }
        System.out.println("==================================================");

        // Array Length
        // Inorder to get the number of elements in ana array, you can use the length field of an array.
        // The length field returns the size of the array.
        // It can be used by writing the following
        // arrayName.length.
        // Example
        System.out.println(studentNames.length);
        System.out.println("==================================================");

        // Create a program that asks a user for 5 integers and then prints out their sum and average

        // prompt the user to enter 5 numbers
        int[] integer = new int[5];
        for (int noEntered = 0; noEntered < integer.length; noEntered++) {
            System.out.println("Enter integer " + (noEntered + 1) + ":");
            integer[noEntered] = sc.nextInt();
        }

        // Finding total sum
        int sum = 0;
        int average = 0;
        // Finding the average
        // Average = total/number of integer
        System.out.println("==================================================");
        for (int b = 0; b < integer.length; b++) {
            sum = sum + integer[b];
        }

        // compute the average
        average = sum / integer.length;

        // output the sum and average
        System.out.println("The Sum of the 5 integers is: " + sum);
        System.out.println("The Average of the 5 integers is: " + average);

        System.out.println("==================================================");

        // Multi-Dimensional Array
        // Are implemented as arrays of arrays
        // They are declared by appending the appropriate number of bracket pairs after the array name.
        // syntax: 2-D (Array)
        // type[][] array.name = new type[row][column];

        // Example:
        // a 2D integer (512 x 128)
        int[][] twoD = new int[512][128];

        // a 3D Array (8 x 16 x 24)
        char[][][] threeD = new char[8][16][24];

        // a 2D String Array
        String[][] dogNames = {
                {"Terry", "brown"},
                {"Kristin", "white"},
                {"Toby", "gray"},
                {"Fido", "black"}
        };

        // Accessing elements of a multidimensional array
        // To access an element in a multidimensional array is just the same as accessing the elements in a one dimensional array.
        // For example
        // To access the first element in the first row o the array dogNames, we write the following

        System.out.println(dogNames[0][0]);
        // This will print the String "Terry" on the screen
        System.out.println("==================================================");

        // Challenge
        // Create a java program to track grades of students against multiple subjects using a 2D array. Implement the following functionalities to:
        // -> input grades for each student in each subject
        // -> calculate and display the average for each student
        // -> calculate and display the average for each subject

        // create a variable to store number of students and number of subjects
        int numStudents;
        int numSubjects;

        // Prompt the user for the numbers and store them in their appropriate arrays
        System.out.println("Enter Number of Students: ");
        numStudents = sc.nextInt();

        System.out.println("Enter Number of Subjects: ");
        numSubjects = sc.nextInt();
        // Create an array to store grades
        int[][] studentGrades = new int[numStudents][numSubjects];
        // input grades (using nested for loops)
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter Grades for " + (i + 1) + ": ");
            for (int j = 0; j < numSubjects; j++) {
                System.out.println("Enter Grades for Subject " + (j + 1) + ": ");
                studentGrades[i][j] = sc.nextInt();
            }
        }
        // calculate the average grade for each student and output it
        for (int i = 0; i < numStudents; i++) {
           int total = 0;
            for (int j = 0; j < numSubjects; j++) {
                total += studentGrades[i][j];
            }

            // create a variable for the average grade
            double averageStudent = (double) total / numSubjects;
            // output the average
            System.out.println("Average Grade for Student: " + (i + 1) + ": " + averageStudent);
        }
        // calculate the average grade for each subject and output it
        for (int j = 0; j < numSubjects; j++){
           int total = 0;
            for(int i = 0; i < numSubjects; i++){
                total += studentGrades[i][j];
            }
            double averageStudent = (double) total / numSubjects;
            System.out.println("Average Grade for Subject: " + (j + 1) + ": " + averageStudent);

        }


    }
}

import java.util.Locale;
import java.util.Scanner;

public class RepetitionStructures {
    /** Are java statement that allow us to execute specific blocks of code a number of times.

     There are 3 types

     1. While-loop
     2. do-while loop
     3. for-loop
    */

    public static void main(String[] args) {
        //1. While-loop[ -> is a statement or block of code that is repeated as long as some conditions is satisfied.

        // While loop has the form (syntax)

        // while (boolean_expression) {
       //     statement1;
       //     statement2;
       // }

        // The statements inside the while loop are executed as long as the boolean_expression evaluates to true.

        // Example:
        // Write a while loop that prints the integers 1 2 3 4 5 6 7 8 9 10

        int x = 1;

        // repeat as long as the value of x is less than 10 0r equal to 10
        while (x < 11) {
            System.out.println(x);
            // x++;
            // x +=1;
            x = x + 1;
        }
        System.out.println("======================================================");

        // Output 0 2 4 6 8 10 12 14 16 18 20
        int y = 0;
        while (y < 21){
            System.out.println(y);
            y +=2;
        }

        System.out.println("==================================================");
        // Output: 15 12 9 6 3 0 -3 -6 -9 -12 -15
        int z = 15;
        while (z > -16) {
            System.out.println(z);
            z = z - 3;
        }
        System.out.println("==================================================");

        // 2. do....while
        // Statements inside a do-while loop are executed several times as long as the condition is satisfied or true
        // it is similar to a while loop, the main difference is that statements inside a do-while loop are executed at least once.

        // syntax
       // do{
       //     statement1;
       //     statement2;
       // } while (boolean_expression);

        // Output 1 2 3 4 5 6 7 8 9 10

        int k = 1;
        do {
            System.out.println(k);
            k++;
        } while (k < 11);
        System.out.println("==================================================");

        // Output 0 5 10 15 20 25 30 35 10 45 50
        int q = 0;
        do{
            System.out.println(q);
            q = q + 5;
        } while (q <= 50);
        System.out.println("==================================================");
        // Output 50 45 40 35 30 25 20 15 10 5 0
        int w = 50;
        do{
            System.out.println(w);
            w = w - 5;
        } while (w != -5 );
        System.out.println("==================================================");

        // 3. for loop
        // a for loop allows execution of the same code a number of times.

        // for-loop syntax
       // for(InitializationExpression; LoopCondition; StepExpression){
       //     statement1;
       //     statement2;
       // }

        // where;
        // -> InitializationExpression: initialize the loop variable
        // -> LoopCondition: compares the loop variable to some limit
        // -> StepExpression: updating the loop variable

        // Example:
        // output: 1 2 3 4 5 6 7 8 9 10
        for(int e = 1; e < 11; e++){
            System.out.println(e);
        }
        System.out.println("==================================================");

        // output 10 20 30 40 50 60 70 80 90 100
        for(int t = 10; t <= 100; t += 10){
            System.out.println(t);
        }
        System.out.println("==================================================");

        // Branching statements
        // Branching allow us to redirect the flow of program execution.
        // Java offers 3 branching statements
        // i. break
        // ii. continue
        // iii. return

        // i. Break Statement
        // Terminates the enclosing switch statement, and flow of control transfers to the statement immediately following the switch.
        // This can also be used to terminate a for, while or do-while-loop

        String[] studentNames = {"Joanoah", "Bradley", "Muzna","Hamza","Ian","Benson","Praise","Ephraim","Frank","Ryan","Nathan","Yasmin","Dominic","Phil","Brenda"};

        // create a scanner object
        Scanner sc = new Scanner(System.in);

        // ask the user for the name they want to search in the class
        System.out.print("Enter the name of the student you wish to search for: ");
        String searchName = sc.next();
        boolean foundName = false;

        for(int idx = 0; idx < studentNames.length; idx++) {
            if (studentNames[idx].equals(searchName)) {
                foundName = true;
                break;
            }
        }

        if(foundName){
            System.out.println(searchName + " found!");
        } else {
            System.out.println(searchName + " not found!");
        }

        System.out.println("==================================================");

        // ii. Continue Statement
        // Skips to the end of the innermost loop's body and evaluates the boolean expression that controls the loop, basically skipping the remainder of this iteration of the loop.

        // Example:

        String[] names = {"Beah", "Bianca", "Lanca", "Beah"};

        int count = 0;

        for (int p = 0; p < names.length; p++){
            if (!names[p].equals("Beah")){
                continue; // skip next statement
            }
            count++;
        }

        System.out.println("There are " + count + " Beahs in this list.");

        System.out.println("==================================================");

        // nested for loop
        // create a times table for a user provided number

        // ask the user for the times table number
        System.out.println("Enter the times table number: ");
        int timesTable = sc.nextInt();

        for(int times = 1; times <= 12; times++){
            System.out.println(timesTable + " X " + times + " = " + (timesTable * times));
        }

        System.out.println("==================================================");

        // create the whole times table
        for (int m = 1; m <=20; m++){
            for(int r = 1; r <=10; r++){
                System.out.println(m + " X " + r + " = " + (m * r));
            }
            System.out.println("--------------------------------------------------------------------------");
        }
        System.out.println("==================================================");

        // iii. Return Statement
        // return is used to exit from the current method
        // flow of control return to the statement that follows the original method call
        // to return a value simply put the value (or an expression that calculate the value) after the return keyword
        // for example
        //return count++; or return "Java";
        // the type of data declared by the method MUST match the type of value returned by the return statement.
        // when a method is declared void, use the form of return that doesn't return a value.
        // for example return;


        // close the scanner object
        sc.close();
    }
}

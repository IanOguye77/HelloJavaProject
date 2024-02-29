import java.util.*;

public class DecisionControlStructure {
    /**
     * Decision Control Structures\
     *
     * These are java statement that allow us to select and execute specific blocks of code while skipping other sections.
     * <p>
     * There are three types:
     *
     * i. if statement
     * ii. if-else statement
     * iii. if-else-if-else statement
     */

    public static void main(String[] args) {
        // 1. if statement
        // Specifies that a statement (or block of code) will be executed if and only a certain boolean statement is true.

        // syntax
        // if (boolean_expression)
        //     statement;

        // or

        // if (boolean_expression) {
        //     statement1;
        //     statement2;
        // }

        // where;
        // -> boolean_expression is either a boolean expression or boolean variable

        // Example
        int grade = 68;

        // Print congratulations if grade is greater than 60
        if (grade > 60)
            System.out.println("Congratulations!");

        if (grade > 60) {
            System.out.println("Congratulations!!");
        }

        // Print "Congratulations" if grade is greater than 60 and also print "You Passed!"
        if (grade > 60) {
            System.out.println("Congratulations" + "," + "You Passed!");
        }

        System.out.println("==============================");

        // ii. if-else statement
        // used when we want to execute certain statement if a condition is true and a different statement if a condition is false.

        // syntax
        // if (boolean_expression){
        //     statement1;
        //    statement2
        // } else {
        //   statement3;
        //  statement4;
        // }


        if (grade > 80) {
            System.out.println("Congratulations!");
        } else {
            System.out.println("Sorry You Failed!");
        }

        // iii. if-else-if-else statement
        // The statement in the else clause of an if-else block can be treated as another if-else structure
        // This cascading of structure allow us to make more  complex selections
        // use to execute multiple courses of actions

        // syntax

        // if (condition1) {
        //    statement will execute if condition1 is true
        //} else if (condition2) {
        //    statement will execute if condition1 is false and condition2 is true
        // } else if (condition3) {
        //   statement will execute if condition1  and condition2 is false and condition3 is true
        //} else {
        //   will execute if all conditions are false
        // }

        // Example

        // Print "Excellent!!" if grade is greater than 90, "Very Good!" if greater than 60, otherwise "Sorry You Failed!"

        if (grade > 90) {
            System.out.println("Excellent!!");
        } else if (grade > 60) {
            System.out.println("Very Good!");
        } else {
            System.out.println("Sorry You Failed!");


        // Switch Statement
        // A switch allows branching on multiple outcomes
        // It has the following form (syntax)

        // switch (switch_expression){
        //   case case_selector1:
        //      statement1;
        //      statement2;
        //    case case_selector2:
        //        statement1;
        //        statement2;
        //    default:
        //        statement1;
        //        statement2;

        // }

        // Where:
        // -> switch_expression: is an integer, or character expression
        // -> case_selector1, case_selector2, and so on: are unique integer or character constants

        // When a switch statement is encountered:-
        // Java first evaluates switch_expression, and jumps to the case whose selector matches the value of the expression.

        // The program executes the statement in order from that point on until a break statement is encountered, skipping then to the first statement after the end of the switch structure.

        // If none of the cases are satisfied, the default block is executed. Take note however, that the default part is optional.

        // NOTE:
        // Unlike with the if statement, the multiple statements are executed in the switch statement without needing the curly braces.

        // When a case in a switch statement has been matched, all the statements associated with that case are executed. Not only that, the statements associated with succeeding cases are also executed.

        // To prevent the program from executing statements in the subsequent cases, we use a break statement as our last statement.


    int score = 90;

    switch(score) {
        case 100:
            System.out.println("Excellent!");
            break;
        case 90:
            System.out.println("Good Job!");
            break;
        case 80:
            System.out.println("Study Harder!");
            break;
        default:
            System.out.println("Sorry, You Failed.");
         }
    }

    // Create a Java program using switch statement that asks the user for an integer between 1 and 7 inclusive and then outputs the day of the week e.g. if the user entered 1, then output "Sunday"

    Scanner sc = new Scanner(System.in);

        int dayOfTheWeek;

    System.out.print("Enter an integer between 1 and 7 inclusive: ");
    dayOfTheWeek = sc.nextInt();

    switch (dayOfTheWeek){
        case 1:
            System.out.println("Today is on Sunday");
            break;
        case 2:
            System.out.println("Today is on Monday");
            break;
        case 3:
            System.out.println("Today is on Tuesday");
            break;
        case 4:
            System.out.println("Today is on Wednesday");
            break;
        case 5:
            System.out.println("Today is on Thursday");
            break;
        case 6:
            System.out.println("Today is on Friday");
            break;
        case 7:
            System.out.println("Today is on Saturday");
            break;
        default:
            System.out.println("Invalid Day, Please enter an integer between 1 and 7 inclusive");
    }

    // 2. ask the user for a color then print if that is their favorite color if it matches with the one in the system

         String favoriteColor = null;

    System.out.println("Enter any color");
    favoriteColor = sc.next(); // Red

    switch (favoriteColor.toLowerCase()) { // red
        case "red":
            System.out.println("Your favorite color is " + favoriteColor);
            break;
        case "green":
            System.out.println("Your favorite color is " + favoriteColor);
            break;
        case "blue":
            System.out.println("Your favorite color is " + favoriteColor);
            break;
        default:
            System.out.println("Sorry, we don't have your favorite color!");
    }


}
}


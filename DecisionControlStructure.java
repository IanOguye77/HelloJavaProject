public class DecisionControlStructure {
    /**
     * Decision Control Structures\
     *
     * These are java statement that allow us to select and execute specific blocks of code while skipping other sections.
     *
     * There are three types:
     *
     * i. if statement
     * ii. if-else statement
     * iii. if-else-if-else statement
     */

    public static void main(String[] args){
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


        if (grade > 80){
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
        } else if (grade > 60){
            System.out.println("Very Good!");
        } else {
            System.out.println("Sorry You Failed!");
        }
    }
}

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
       // int w = 50;
       // do{
       //     System.out.println(w);
       //     w = w - 5;
       // } while (w );
       // System.out.println("==================================================");

    }
}

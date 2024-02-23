public class Variables {
    /**
     * Variables in java
     *
     * A variable a named memory location in the computer's memory for storing different types of data
     * A variable is an item for storing the state of objects
     * A variable is a container/box for holding data
     *
     * A variable has:
     * data type -> specifies the type of data that the variable can hold
     * name -> used to reference the variable (must follow the identifier rules)
     */

    public static void main(String[] args){
        // declaring and initializing variables
        // in java, we declare variables as follows :

        // syntax:
        // <data_type> <variable_name> [ initial_value];

        // declare and initialize 8 data types
        String userName = "Ian";
        //String userAge = "22";
        //String userName = "Ian";
        //String userName = "Ian";
        //String userName = "Ian";
        //String userName = "Ian";
        //String userName = "Ian";

        // Integer
        int userAge = 18;

        // Byte
        byte userId = 100;

        // Short
        short userStaffNumber = 11699;

        // long
        long userAccountBalance = 9876543210L;

        // Float
        float userApprovalLoanAmount;

        // Double
        double userTransferredAccountAmount;

        // Character
        char favLetter = 'I';

        // variable declared on one line (Not recommended)
        double quiz = 10, exam =0, grade =0;

        // Recommended (declare a single variable on a single line)
        double studentQuiz = 10;
        double studentExam = 0;
        double studentGrade = 0;

        String firstName = "Ian";
        String lastName = "Oguye";

        // Outputting variables data
        // System.out.println() -> appends a line break
        // System.out.print() -> append the data on the same line

        System.out.println(firstName);
        System.out.println(lastName);

        String userGreeting = "Hello,";
        String userTarget = "World";

        System.out.print(userGreeting);
        System.out.print(userTarget);

        // in java programming we have two type of variables namely:-
        // -> Primitive variables: stores memory in the actual location of where the data is e.g. int, long...
        int number =10; // primitive data example

        // -> Reference variables: stores the address in the memory location.Points to another memory location where the actual data is. e.g. string
        String favLanguage = "java";

    }
}

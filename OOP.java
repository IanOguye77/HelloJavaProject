public class OOP {
    /**
     * CREATING YOUR OWN CLASSES
     * At the end of this lecture, you should be able to
     *
     * -> Create your own classes
     * -> Declare properties(fields) and methods(actions) for your classes
     * -> Use the "this" keyword to access instance data
     * -> Create and call "overloaded" methods
     * -> Use access modifiers to control access to class members
     *
     * Defining Your Own Class
     * In Java, a class is a blueprint or template of creating objects.
     * It defines the structure and behaviour of objects
     * They encapsulate data(attributes) and methods(functions) that operate on that data
     * Encapsulation involves bundling the data(attributes) and methods(functions) together within a class.
     * Encapsulation helps in hiding the internal implementation details of a class and exposing only necessary functionalities through well-defined.
     * It also ensures data integrity and improves code maintainability by restricting direct access to class members from outside the class.
     * Methods(also called member functions) define the behaviour of an object. They perform operations on the objects data or provide functionalities.
     * Both attributes and methods are declared within the class definition
     */

    // Things to take note of for the syntax defined in this section
    // * -> means that there may be 0 or more occurrences of the line where it was applied
    // <description> indicated that you have to substitute an actual value for this part instead of typing it as it is.
    // [] -> indicates that this part is optional

    // To define a class, we write

   // <modifier> class <name>{
   //     <attributeDeclaration>*
   //     <constructorDeclaration>*
   //     <methodDeclaration>*
   // }

    // where:
    //-> <modifier> is an access modifier, which may be combined with other types of modifier.

    // Example:
    //public class StudentRecord {

    //}

    // Where:
    // public -> means that our class is accessible tp other classes outside the package
    // class -> is the keyword used to create a class in java.
    // StudentRecord -> is a unique identifier that describes our class

    // Coding Guidelines

    // i. Think of an appropriate name of your class. Don't just call your class XYZ or ABC or any random names you can think of.
    // ii. Class name starts with a CAPITAL letter - not a requirement.
    // iii. The filename of your class must have the SAME NAME as of your class name.

    // Instance variables verses Static Variables

    // Instance Variables(Properties) vs Class(Static) Variables

    // Instance variables
    // Belong to an object instance
    // Value of variable of an object instance is different from the ones of other object instances

    // Class Variables
    // Variables that belong to the whole class
    // This means that they have the same value for all the object instances in the same class.

    // Instance Variables
    // Declaring Properties (attributes)
    // To declare a certain attribute for our class, we write,

   // <modifier> <tye> <name> [=<default_value>];

    // coding guidelines
    // i. Declare all instance variables after "public" class
    // ii. Declare one variable for each line
    // iii. Use an appropriate data type for each variable declare you declare
    // iv. Declare instant variable as private so that only class methods can access them directly (encapsulation)

    // Static variables (class variables)
    // We use the keyword "static" to indicate that a variable is a static variable
    // where :
    // private here means that the variables are only accessible within the class. Other objects cannot access variables directly.

    // Methods
    // To declare methods we write

    // <modifier> <returnType> <name> (<parameter>*) {
    //      <statement>*
    // }

    // Where:
    // <modifier> can carry a number of different modifiers
    // <returnType> - can be any data type (including void)
    // <name> can be any valid identifier
    // <Parameter> - <parameter_type><parameter_name>

    // Accessor (Getter) Methods
    // Used to read values from our class variables (instance/static).
    // Usually written as
    // get<NameOfInstanceVariable>
    // It also returns a value


    // public String getName() {
    //     return name;
    // }

    // Where:
    // Public - means that the method can be called from objects outside the class.
    // String - is the return type of the method. This means that the method should return a value of type String.
    // getName - the name of the method
    // () - this means that our method does not have any parameters.

    // Mutator (Setter) Methods
    // Used to write or change values of our class variables (instance/static)
    // Usually written as:
    // set<NameOfInstanceVariable>

   // public void setName(String temp){
   //     name = temp;
   // }

    // Where:
    // public - means that the method can be called from outside the class
    // void - means that the method does not return any value
    // setName - the name of the method
    // (String temp) - parameter that will be used inside our method.

    // Multiple return statement
    // You can have multiple return statements for a method as long as they are on the same block
    // You can also use constants to return values instead of variables

    // Example:
    public String getNumberInWords(int num){
        String defaultNum = "zero";
        if(num == 1){
            return "One"; // return a constant
        } else if(num == 2){
            return "Two"; // return a constant
        }
        // return a variable
        return defaultNum;
    }

    // Static Methods
    //public static int getStudentCount(){
    //    return StudentCount;
    // }

    // Where:
    // static - means that the method is static and should be called by typing, [ClassName.MethodName]. For example: in this case, we call the method StudentRecord.getStudentCount()
    // int - is the return type of the method. This means that the method should return a value of type int.
    // getStudentCount - the name of the method
    // () - this means that our method does not have any parameters

    // Coding Guidelines
    // i. Method names should start with a small letter
    // ii. Method names should be verbs
    // iii. Always provide documentation before the declaration of the method. You can use javadocs style for this.

    // Overloading Methods
    // Method overloading allows a method with the same name but different parameters, to have different implementation and return values of different types.
    // Can be used when the same operations has different implementations.

    // Always remember that overloaded methods have the following properties:
    // -> the same method name
    // -> different parameter or different number of parameters
    // -> return types can be different or the same

    // add two methods in StudentRecord class

    // Constructors
    // Constructor Methods
    // Constructors are important in instantiating an object.
    // It is a method where all the initialization  are placed
    // The following are properties of a constructor
    // -> Constructor have the same name as the class
    // A constructor is just like an ordinary method, however only the following information can be place inside the header of a constructor.
    // -> Scope or accessibility identifier (like public...), constructor's name and parameters if it has any.
    // -> Constructors does not have any return value
    // You cannot call a constructor directly, it can only be called by using the "new" operator during class instantiation.

    // To declare a constructor, we write
    // <modifier> <className> (<parameter(s)) {
    //      <statement>*
    // }


    // Default Constructor (Method)
    // The default constructor (no-arg constructor)
    // -> is the constructor without any parameters
    // if the class does not specify any constructors, then an implicit constructor is created.

    // Example of a default constructor

    //public Student(){
        // some code here
    // }


    // Overloading Constructor Methods
    //public Student(){
        // some code here
    // }

    //public Student(String temp){
        // this.name = temp;
    // }

    //public Student(String name, String address){
        // this.name = name;
        // this address = address;
    // }

    //public Student(double mGrade, double eGrade, double sGrade){
        // mathGrade = mGrade;
        // englishGrade = eGrade;
        // scienceGrade = sGrade;
    // }

    // This() constructor call
    // constructor calls can be chained, meaning, you can call another constructor from inside another constructor
    // we can use this() call for this
    // There are few things to remember when using the this() constructor call
    // -> when using the this() constructor call, IT MUST OCCUR AS THE FIRST STATEMENT in a constructor
    // -> It can ONLY BE USED IN A CONSTRUCTOR DEFINITION. The this() call can be followed by any other relevant statements

    // This Reference
    // The "this" reference refers to current object instance itself.
    // used to access the instance variables shadowed by the parameters
    // To use "this" reference, we type,
   // this.<nameOfInstanceVariable>
    // You can only use "this" reference for instance variables and NOT static or class variables

    // Access modifiers
    // There are four different types of member access modifiers in java:
    // i. Public (least restrictive)
    // ii. Protected
    // iii. Default
    // iv. Private (most restrictive)

    // The first three access modifiers are explicitly written in the code to indicate the access type, for the 3rd one "default", no keyword is used.

    // i. Public accessibility
    // Specifies that class members (variables or members) are accessible to anyone, both inside and outside the class and outside the package
    // Any object that interacts with the class can have access to the public mamebers of the class
    // keyword: public
    // example: public int userAge;, public String userName;

    // ii. Protected accessibility
    // Specifies that the class members are accessible only to methods in that class and the subclasses of the class.
    // The subclass can be in different packages
    // keyword: protected
    // Example: protected String name;

    // iii. Default accessibility
    // specifies that only classes in the same packages can have access to the class variables and methods
    // nk actual keyword for the default modifier - it is applied in the absence of an access modifier
    // Example: String name;

    // iv. Private accessibility
    // specifies that the class members are only accessible by the class they are defined in.
    // keyword: private
    // example: private int accountNumber;

    // NB:
    //The instance variable of a class should normally be declared "private", and the class will just provide accessor and mutator methods to these variables.
}

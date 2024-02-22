public class JavaLiterals {
    public static void main(String[] args){
        /**
         * Java Literals
         * There are different types of literals
         * i. Integer Literals
         * ii. Floating Literals
         * iii. Boolean Literals
         * iv. Character Literals
         * v. String Literals
         */

        // 1. Integer Literals
        // They come in different formats
        // -> decimal (base 10)
        // It does not have a decimal notation e.g. 12
        System.out.println("Example of a Integer literal is: " + 12);

        // -> hexadecimal(base 16)
        // Precede by 0x 0X e.g. 0xC
        System.out.println("Example of a Hexadecimal literal is: " + 0xC);

        // -> octal(base 8)
        // Precede by 0 e.g. 014
        System.out.println("Example of a Octal literal is: " + 015);

        // 2. Floating Literals
        // Represents decimals with fractional parts e.g 3.1416
        // can be expressed in standard or scientific notation
        // e.g. 583.45 (standard) or 5.88345e2
        System.out.println("Example of a Standard float literal is: " + 584.45);
        System.out.println("Example of a Scientific float literal is: " + 5.88345e2);

        // 3. Boolean Literals
        // They have only two values, true or false
        System.out.println("Example of a Boolean literal is: true and false");

        // 4.Character Literals
        // It represents a single unicode characters
        // A unicode character set replaces the 8-bit ASCII set
        // Unicode allows the inclusion of symbols and special characters from other language
        // To use a character literal, enclose the character in single quote
        // e.g. letter a is represented as 'a'
        System.out.println('a');
        System.out.println("This is a paragraph with \n a new line or line break");

        // 5. String Literal
        // Represent multiple characters and are enclosed by double quotes example: "Hello World"
        System.out.println("Hello World!!");

        // Primitive Data Types
    }
}

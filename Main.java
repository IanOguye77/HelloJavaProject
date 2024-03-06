public class Main {
    // use this class to run studentRecord class
    public static void main(String[] args) {
        // create three objects for student record class
        StudentRecord ianRecord = new StudentRecord();
        StudentRecord dennisRecord = new StudentRecord();
        StudentRecord muznaRecord = new StudentRecord();

        // set the names of the students
        ianRecord.setName("Ian");
        dennisRecord.setName("Dennis");
        muznaRecord.setName("Muzna");


        System.out.println("=================================");

        // print the students name
        System.out.println(muznaRecord.getName());
        System.out.println(ianRecord.getName());
        System.out.println(dennisRecord.getName());

        System.out.println("=================================");

        // print number of students
        System.out.println("Count = " + StudentRecord.getCount());

        System.out.println("=================================");

        // Print car information
        System.out.println("Make: " + CarRecord.getMake());
        System.out.println("Model: " + CarRecord.getModel());
        System.out.println("Year: " + CarRecord.getYear());
        System.out.println("Color: " + CarRecord.getColor());
        System.out.println("Price: $" + CarRecord.getPrice());

        System.out.println("=================================");

        // set info for student1
        ianRecord.setAddress("Nairobi");
        ianRecord.setAge(20);
        ianRecord.setMathGrade(100);
        ianRecord.setEnglishGrade(90);
        ianRecord.setScienceGrade(95);

        // overloaded methods
        ianRecord.print(ianRecord.getName());
        ianRecord.print(ianRecord.getMathGrade(), ianRecord.getEnglishGrade(), ianRecord.getScienceGrade());

        System.out.println("=================================");
    }

}

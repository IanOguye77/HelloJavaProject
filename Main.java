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

        // print the students name
        System.out.println(muznaRecord.getName());
        System.out.println(ianRecord.getName());
        System.out.println(dennisRecord.getName());

        // print number of students
        System.out.println("Count = " + StudentRecord.getCount());
    }
}

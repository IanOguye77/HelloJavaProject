public class StudentRecord {
    // Instance Variables

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int count;

    // static/class variable(s)
    private static int studentCount;

    public void setName(String temp){
        name = temp;
    }

    /**
     * Returns the name of the student (Accessor method)
     * @return name
     */
    public String getName() {
        return name;
    }


    /**
     * computes the average of the english, math and science grades
     * Accessor method
     */

    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3;
        return result;
    }

    /**
     *
     * @returns the number of instances of studentRecords
     */
    public static int getCount(){
        return studentCount;
    }

    public void setAge(int Age) {
        age = Age;
    }
    public int getAge() {
        return age;
    }
    public void setAddress(String Address) {
        address = Address;
    }
    public String getAddress() {
        return address;
    }

    public void setMathGrade(double MathGrade) {
        mathGrade = MathGrade;
    }
    public double getMathGrade() {
        return mathGrade;
    }
    public void setEnglishGrade(double EnglishGrade) {
        englishGrade = EnglishGrade;
    }
    public double getEnglishGrade(){
        return englishGrade;
    }

    public void setScienceGrade(double ScienceGrade) {
        scienceGrade = ScienceGrade;
    }

    public double getScienceGrade() {
        return scienceGrade;
    }


    // we'll add more cade here

}

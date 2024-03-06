public class CarRecord{
    // Properties
    private static String make;
    private static String model;
    private static int year;
    private static String color;
    private static double price;

    // Constructor

    // Getters and setters
    public void setMake(String Make) {
        make = Make;
    }

    public static String getMake() {
        return make;
    }

    public void setModel(String Model) {
        model = Model;
    }

    public static String getModel() {
        return model;
    }


    public void setYear(int Year) {
        year = Year;
    }
    public static int getYear() {
        return year;
    }


    public void setColor(String Color) {
        color = Color;
    }
    public static String getColor() {
        return color;
    }

    public void setPrice(double Price) {
        price = Price;
    }
    public static double getPrice() {
        return price;
    }

}

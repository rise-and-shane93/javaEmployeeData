public class Date {

    // initialize the variables
    private int month;
    private int day;
    private int year;

    // Constructor function
    public Date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    // Create output for the employee's hire date
    public String toString() {
        return "\n\nHire date: " + month + "/" + day + "/" + year;
    }
}

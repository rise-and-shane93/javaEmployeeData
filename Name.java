public class Name {

    // initialize variables
    private String firstName;
    private String lastName;

    // Constructor function
    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Create output for employee's name
    public String toString() {
        return "\nName: " + firstName + " " + lastName;
    }
}

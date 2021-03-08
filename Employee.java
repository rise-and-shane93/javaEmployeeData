public class Employee {
    
    // initialize the variables
    private int number;
    private String name;
    private String address;
    private String hireDate;

    // Constructor function
    public Employee(int number, String name, String address, String hireDate) {
        // return name.toString() + address.toString() + hireDate.toString();
        this.number = number;
        this.name = name;
        this.address = address;
        this.hireDate = hireDate;
    }

    // Creates the string to output the employee's information
    public String toString() {
        return number + "\n" + name + address + hireDate;
    }
}
public class Employee {
    
    private int number;
    private String name;
    private String address;
    private String hireDate;

    public Employee(int number, String name, String address, String hireDate) {
        // return name.toString() + address.toString() + hireDate.toString();
        this.number = number;
        this.name = name;
        this.address = address;
        this.hireDate = hireDate;
    }

    public String toString() {
        return number + "\n" + name + address + hireDate;
    }
}
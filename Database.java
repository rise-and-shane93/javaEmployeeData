import java.util.Scanner;

public class Database {
    public static void main(String[] args) {

        int numEmployees;
        int employeeNumber;
        String firstName;
        String lastName;
        String streetAddr;
        String cityAddr;
        String stateAddr;
        int zipAddr;
        int hireMonth;
        int hireDay;
        int hireYear;

        Scanner input = new Scanner(System.in);

        System.out.print("How many employees are you entering in the system today? Please enter non-negative integer: ");
        numEmployees = input.nextInt();

        Employee[] employeeRecords = new Employee[numEmployees];

        for (int i = 0; i < numEmployees; i++) {

            System.out.print("Employee " + (i + 1) + "/" + numEmployees + ". Please enter the employee's number: ");
            employeeNumber = input.nextInt();

            System.out.print("Please enter the employee's first name\nfollowed by the last name (example: John Doe): ");
            firstName = input.next();
            lastName = input.next();

            Name employeeName = new Name(firstName, lastName);

            System.out.println();
            input.nextLine();
            System.out.print("Now enter the employee's street address. For example, if the\nemployee's address is 10 Light St Baltimore, MD 21202, enter '10 Light St.': ");

            streetAddr = input.nextLine();

            System.out.println();
            System.out.print("Next, enter the city/state/ZIP portion of the employee's street address\nby only using numbers and letters. For example, if the employee's address\nis '10 Light St. Baltimore, MD 21202', enter 'Baltimore MD 21202': ");
            cityAddr = input.next();
            stateAddr = input.next();
            zipAddr = input.nextInt();
            input.nextLine();

            while (cityAddr.contains(",") || stateAddr.contains(",")) {
                System.out.print("Invalid format. Please enter the city/state/ZIP portion of the employee's street address\nby only using numbers and letters. For example, if the employee's address\nis '10 Light St. Baltimore, MD 21202', enter 'Baltimore MD 21202': ");
                cityAddr = input.next();
                stateAddr = input.next();
                zipAddr = input.nextInt();
                input.nextLine();
            }

            Address employeeAddr = new Address(streetAddr, cityAddr, stateAddr, zipAddr);

            System.out.println();
            System.out.print("Finally, enter the employee's hire date with as an integer with a space between the month, day, and year\nas well as following the aforementioned format. For example, if the employee's hire date was September 17, 2020,\nenter '9 17 2020': ");
            hireMonth = input.nextInt();
            hireDay = input.nextInt();
            hireYear = input.nextInt();

            Date employeeHireDate = new Date(hireMonth, hireDay, hireYear);

            employeeRecords[i] = new Employee(employeeNumber, employeeName.toString(), employeeAddr.toString(), employeeHireDate.toString());
            

    }

    for (int j = 0; j < employeeRecords.length; j++) {
        System.out.println();
        System.out.println(employeeRecords[j].toString());
        System.out.println("======================");
    }
    
}

}
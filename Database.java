/**
 * This program allows the user to input employees' number, name, address, and hire date. Then, it will
 * output each record. The program uses concepts of classes, polymorphism, inheritance and composition
 * in order to produce the desired solution.
 * 
 * @author Shane Harper
 * EN.605.201.84.SP21
 * Assignment 6 - Employee Records
 */

import java.util.Scanner;

public class Database {
    public static void main(String[] args) {

        // initialize the necessary variables for all of the employee data.
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

        // initialize Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user for how many employees the user will input
        System.out.print("How many employees are you entering in the system today? Please enter non-negative integer: ");
        numEmployees = input.nextInt();

        // initialize the Employee array with the lengh corresponding to the numEmployees variable
        Employee[] employeeRecords = new Employee[numEmployees];

        // for loop to input employee data
        for (int i = 0; i < numEmployees; i++) {

            // Starts by showing the user which employee they're on in the loop and prompts for the employee's number
            System.out.print("Employee " + (i + 1) + "/" + numEmployees + ". Please enter the employee's number: ");
            employeeNumber = input.nextInt();

            // Prompts the employee for their first name followed by their last name
            System.out.print("Please enter the employee's first name\nfollowed by the last name (example: John Doe): ");
            firstName = input.next();
            lastName = input.next();

            // creates an instance employeeName object
            Name employeeName = new Name(firstName, lastName);

            System.out.println();
            input.nextLine(); // clears the input line

            // Prompts the user for their street address
            System.out.print("Now enter the employee's street address. For example, if the\nemployee's address is 10 Light St Baltimore, MD 21202, enter '10 Light St.': ");

            streetAddr = input.nextLine();

            System.out.println();

            // Prompts the user for their city/state/ZIP separated by spaces
            System.out.print("Next, enter the city/state/ZIP portion of the employee's street address\nby only using numbers and letters. For example, if the employee's address\nis '10 Light St. Baltimore, MD 21202', enter 'Baltimore MD 21202': ");
            cityAddr = input.next();
            stateAddr = input.next();
            zipAddr = input.nextInt();
            input.nextLine();

            // Checks for any commas in the previous input and if either one evaluates to true, require the user to enter them in again
            while (cityAddr.contains(",") || stateAddr.contains(",")) {
                System.out.print("Invalid format. Please enter the city/state/ZIP portion of the employee's street address\nby only using numbers and letters. For example, if the employee's address\nis '10 Light St. Baltimore, MD 21202', enter 'Baltimore MD 21202': ");
                cityAddr = input.next();
                stateAddr = input.next();
                zipAddr = input.nextInt();
                input.nextLine();
            }

            // Checks if the length of the state abbreviation is 2 and if not, require the user to enter it in again
            while (stateAddr.length() != 2) {
                System.out.print("Invalid state format. Please enter the two letter abbreviation for the state. Ex: Maryland is MD: ");
                stateAddr = input.next();
                input.nextLine();
            }

            // Checks if the length of the zip code is 5 and if not, require the user to enter it in again
            while (Integer.toString(zipAddr).length() != 5) {
                System.out.print("Invalid ZIP format. Please enter the 5 digit zip code. Example: 21201: ");
                zipAddr = input.nextInt();
                input.nextLine();
            }

            // Creates a new instance of the Address object
            Address employeeAddr = new Address(streetAddr, cityAddr, stateAddr, zipAddr);

            System.out.println();

            // Prompt the user for the hire date separated by spaces
            System.out.print("Finally, enter the employee's hire date with as an integer with a space between the month, day, and year\nas well as following the aforementioned format. For example, if the employee's hire date was September 17, 2020,\nenter '9 17 2020'. Please use the integers 1-12 for the month,\n1-31 for the day and 1900-2020 for the year: ");
            hireMonth = input.nextInt();
            hireDay = input.nextInt();
            hireYear = input.nextInt();

            // if ((hireMonth <= 1 || hireMonth >= 12) || (hireDay <= 1 || hireDay >= 31) || (hireYear <= 1900 || hireYear >= 2020)) {
            //     System.out.print("Invalid date format. Please use the integers 1-12\nfor the month, 1-31 for the day and 1900-2020 for the year: ");
            //     hireMonth = input.nextInt();
            //     hireDay = input.nextInt();
            //     hireYear = input.nextInt();
            //     input.nextLine();
            // }

            // Checks if the month, day and year fall within reasonable ranges. For some reason this is not working properly for me.
            if (hireMonth <= 1 || hireMonth >= 12) {
                System.out.print("Invalid month number. Please enter a non-negative integer between 1 and 12: ");
                hireMonth = input.nextInt();
                input.nextLine();
            }

            if (hireDay <= 1 || hireDay >= 12) {
                System.out.print("Invalid day number. Please enter a non-negative integer between 1 and 31: ");
                hireDay = input.nextInt();
                input.nextLine();
            }

            if (hireYear <= 1900 || hireYear >= 2021) {
                System.out.print("Invalid year number. Please enter a non-negative integer between 1900 and 2020: ");
                hireYear = input.nextInt();
                input.nextLine();
            }

            // Creates a new Date object
            Date employeeHireDate = new Date(hireMonth, hireDay, hireYear);

            employeeRecords[i] = new Employee(employeeNumber, employeeName.toString(), employeeAddr.toString(), employeeHireDate.toString());

        }

        // Outputs all of the employee records
        for (int j = 0; j < employeeRecords.length; j++) {
            System.out.println();
            System.out.println(employeeRecords[j].toString());
            System.out.println("======================");
        }
        
    }

}
class Employee {
    int empId;
    String name;
    double monthlySalary;

    // Constructor
    Employee(int empId, String name, double monthlySalary) {
        this.empId = empId;
        this.name = name;
        this.monthlySalary = monthlySalary;
    }

    // Display employee details
    void displayDetails() {
        double annualSalary = monthlySalary * 12;

        // Bonus eligibility
        String eligibility = (monthlySalary >= 30000)
                ? "Eligible" : "Not Eligible";

        // Calculate bonus
        double bonus = (monthlySalary >= 30000)
                ? annualSalary * 0.10 : 0;

        System.out.println("Employee ID     : " + empId);
        System.out.println("Name            : " + name);
        System.out.println("Monthly Salary  : Rs." + monthlySalary);
        System.out.println("Annual Salary   : Rs." + annualSalary);
        System.out.println("Bonus           : Rs." + bonus);
        System.out.println("Eligibility     : " + eligibility);
        System.out.println("--------------------------------");
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        // Array of 5 Employee objects
        Employee[] employees = new Employee[5];

        // Creating 5 employee objects
        employees[0] = new Employee(101, "Arun", 25000);
        employees[1] = new Employee(102, "Bala", 30000);
        employees[2] = new Employee(103, "Karthik", 45000);
        employees[3] = new Employee(104, "Rahul", 28000);
        employees[4] = new Employee(105, "Vijay", 50000);

        // Display all employees
        System.out.println("===== EMPLOYEE DETAILS =====");

        for (int i = 0; i < 5; i++) {
            employees[i].displayDetails();
        }
    }
}
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    int[] marks = new int[3];
    double attendance;

    // Constructor
    Student(int rollNo, String name, int m1, int m2, int m3, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        marks[0] = m1;
        marks[1] = m2;
        marks[2] = m3;
        this.attendance = attendance;
    }

    void display() {
        int total = 0;

        // Calculate total using for loop
        for (int i = 0; i < 3; i++) {
            total = total + marks[i];
        }

        double average = total / 3.0;

        // Ternary operators
        String result = (average >= 50) ? "Pass" : "Fail";

        String scholarship = (average >= 75 && attendance >= 80)
                ? "Eligible" : "Not Eligible";

        String performance = (average >= 85)
                ? "Excellent" : "Good";

        System.out.println("Roll Number : " + rollNo);
        System.out.println("Name        : " + name);
        System.out.println("Total Marks : " + total);
        System.out.println("Average     : " + average);
        System.out.println("Attendance  : " + attendance + "%");
        System.out.println("Result      : " + result);
        System.out.println("Scholarship : " + scholarship);
        System.out.println("Performance : " + performance);
        System.out.println("-----------------------------");
    }

    // Function to calculate average
    double getAverage() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            total = total + marks[i];
        }

        return total / 3.0;
    }
}

public class StudentPerformance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 Student objects
        Student[] students = new Student[5];

        // Input details
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of Student " + (i + 1));

            System.out.print("Roll Number: ");
            int rollNo = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Mark 1: ");
            int m1 = sc.nextInt();

            System.out.print("Mark 2: ");
            int m2 = sc.nextInt();

            System.out.print("Mark 3: ");
            int m3 = sc.nextInt();

            System.out.print("Attendance: ");
            double attendance = sc.nextDouble();

            students[i] = new Student(rollNo, name, m1, m2, m3, attendance);

            System.out.println();
        }

        // Display all students
        System.out.println("\n===== STUDENT PERFORMANCE =====");

        for (int i = 0; i < 5; i++) {
            students[i].display();
        }

        // Find student with highest average
        Student highest = students[0];

        for (int i = 1; i < 5; i++) {
            if (students[i].getAverage() > highest.getAverage()) {
                highest = students[i];
            }
        }

        System.out.println("===== HIGHEST AVERAGE =====");
        System.out.println("Roll Number : " + highest.rollNo);
        System.out.println("Name        : " + highest.name);
        System.out.println("Average     : " + highest.getAverage());

        sc.close();
    }
}
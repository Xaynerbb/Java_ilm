package my_OWN;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Student Manager Loaded");

        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();
        // TODO: plan your menu here
        

        // Add a new student to the list
public static void addStudent(Scanner input, ArrayList<Student> students) {
    System.out.println("\n--- Add Student ---");

    System.out.print("Enter student name: ");
    input.nextLine(); // clear buffer
    String name = input.nextLine();

    System.out.print("Enter student ID: ");
    String id = input.nextLine();

    System.out.print("Enter student course: ");
    String course = input.nextLine();

    students.add(new Student(name, id, course));
    System.out.println("✅ Student added successfully!");
}


        System.out.println("=== STUDENT MANAGEMENT SYSTEM ===");
        System.out.println("1. Add Student");
        System.out.println("2. View Students");
        System.out.println("3. Search Student");
        System.out.println("4. Delete Student");
        System.out.println("5. Exit");
    }

    // Add a new student to the list
public static void addStudent(Scanner input, ArrayList<Student> students) {
    System.out.println("\n--- Add Student ---");

    System.out.print("Enter student name: ");
    input.nextLine(); // clear buffer
    String name = input.nextLine();

    System.out.print("Enter student ID: ");
    String id = input.nextLine();

    System.out.print("Enter student course: ");
    String course = input.nextLine();

    students.add(new Student(name, id, course));
    System.out.println("\u2705 Student added successfully!");
}

}


package Student_Manaemnt_Student;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static ArrayList<Student> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudents();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    static void addStudent() {
        System.out.println("\n--- Add Student ---");

        System.out.print("Enter student name: ");
        input.nextLine(); // consume newline
        String name = input.nextLine();

        System.out.print("Enter student ID: ");
        int id = input.nextInt();

        System.out.print("Enter student course: ");
        input.nextLine(); // consume newline
        String course = input.nextLine();

        students.add(new Student(name, id, course));
        System.out.println("✅ Student added successfully!");
    }

    static void viewStudents() {
        System.out.println("\n--- Student List ---");
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student s : students) {
                System.out.println(s);
            }
        }
    }

    static void searchStudent() {
        System.out.print("\nEnter student ID to search: ");
        int id = input.nextInt();

        boolean found = false;

        for (Student s : students) {
            if (s.getId() == id) {
                System.out.println("✅ Student Found: " + s);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("❌ Student not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("\nEnter student ID to delete: ");
        int id = input.nextInt();

        boolean removed = false;

        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                removed = true;
                System.out.println("✅ Student deleted successfully!");
                break;
            }
        }

        if (!removed) {
            System.out.println("❌ Student not found.");
        }
    }
}

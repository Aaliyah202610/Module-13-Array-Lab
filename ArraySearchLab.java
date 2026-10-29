import java.util.Scanner;

public class ArraySearchLab {
    public static void main(String[] args) {
        String[] students = {
            "John Moss",
            "Mary Johns",
            "Mark Woods",
            "Welbeck Sutcliff",
            "Nancy Brose"
        };

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a student name: ");
        String name = input.nextLine();

        boolean found = false;

        for (int i = 0; i < students.length; i++) {
            if (students[i].equalsIgnoreCase(name)) {
                System.out.println("Student found: " + students[i]);
                System.out.println("Index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }

        input.close();
    }
}

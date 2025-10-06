import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Enter 10 student's information ===");

        int count = 0;
        while (count < 10) {
            try {
                System.out.println("\nStudent " + (count + 1) + ":");

                System.out.print("Roll number: ");
                int rollno = Integer.parseInt(sc.nextLine());

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Address: ");
                String address = sc.nextLine();

                students.add(new Student(rollno, name, address));
                count++;

            } catch (NumberFormatException e) {
                System.out.println("Invalid input.");
            }
        }

        System.out.println("\n=== Original List ===");
        for (Student s : students) {
            System.out.println(s);
        }

        SelectionSorter.selectionSort(students, new SortByName());
        System.out.println("\n=== Sorted by Name ===");
        for (Student s : students) {
            System.out.println(s);
        }

        SelectionSorter.selectionSort(students, new SortByRollNo());
        System.out.println("\n=== Sorted by Roll Number ===");
        for (Student s : students) {
            System.out.println(s);
        }

        sc.close();
    }
}

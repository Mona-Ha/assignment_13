package Ex4;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- PERSON MANAGEMENT ---");
            System.out.println("1. Add Person");
            System.out.println("2. Display All People");
            System.out.println("3. Delete Person By ID");
            System.out.println("4. Edit Person By ID");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Đọc dòng trống

            switch (choice) {
                case 1:
                    personList.addPerson();
                    break;
                case 2:
                    System.out.println("\nList of People:");
                    personList.displayAll();
                    break;
                case 3:
                    System.out.print("Enter ID to delete: ");
                    String idToDelete = sc.nextLine();
                    if (personList.deletePersonById(idToDelete)) {
                        System.out.println("Deleted successfully!");
                    } else {
                        System.out.println("No person found with ID: " + idToDelete);
                    }
                    break;
                case 4:
                    System.out.print("Enter ID to edit: ");
                    String idToEdit = sc.nextLine();
                    personList.editPersonById(idToEdit);
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 0);
    }
}

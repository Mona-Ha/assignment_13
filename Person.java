
package Ex4;
import java.util.Scanner;
public class Person {

    protected String id;
    protected String homeTown;
    protected String dateOfBirth; // Để đơn giản, sử dụng String thay vì kiểu Date

    public Person(String id, String homeTown, String dateOfBirth) {
        this.id = id;
        this.homeTown = homeTown;
        this.dateOfBirth = dateOfBirth;
    }

    public Person() {}

    public void displayInfo() {
        System.out.println("ID: " + id);
        System.out.println("Home Town: " + homeTown);
        System.out.println("Date of Birth: " + dateOfBirth);
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter Home Town: ");
        homeTown = sc.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        dateOfBirth = sc.nextLine();
    }

    public boolean editPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Edit Home Town: ");
        homeTown = sc.nextLine();
        System.out.print("Edit Date of Birth (dd/MM/yyyy): ");
        dateOfBirth = sc.nextLine();
        return true;
    }
}



package Ex4;
import java.util.Scanner;
public class Student extends Person{

    private String major;

    public Student(String id, String homeTown, String dateOfBirth, String major) {
        super(id, homeTown, dateOfBirth);
        this.major = major;
    }

    public Student() {}

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Major: " + major);
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Major: ");
        major = sc.nextLine();
    }

    @Override
    public boolean editPerson() {
        super.editPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Edit Major: ");
        major = sc.nextLine();
        return true;
    }
}


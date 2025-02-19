
package Ex4;
import java.util.Scanner;
public class Teacher extends Person{

    private String department;

    public Teacher(String id, String homeTown, String dateOfBirth, String department) {
        super(id, homeTown, dateOfBirth);
        this.department = department;
    }

    public Teacher() {}

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public void addPerson() {
        super.addPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Department: ");
        department = sc.nextLine();
    }

    @Override
    public boolean editPerson() {
        super.editPerson();
        Scanner sc = new Scanner(System.in);
        System.out.print("Edit Department: ");
        department = sc.nextLine();
        return true;
    }
}



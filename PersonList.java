package Ex4;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    private ArrayList<Person> people;

    public PersonList() {
        people = new ArrayList<>();
    }

    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter type of person (student/teacher): ");
        String type = sc.nextLine().toLowerCase();

        if (type.equals("student")) {
            Student student = new Student();
            student.addPerson();
            people.add(student);
        } else if (type.equals("teacher")) {
            Teacher teacher = new Teacher();
            teacher.addPerson();
            people.add(teacher);
        } else {
            System.out.println("Invalid type!");
        }
    }

    public void displayAll() {
        if (people.isEmpty()) {
            System.out.println("No people in the list.");
        } else {
            for (Person person : people) {
                person.displayInfo();
                System.out.println("--------------------");
            }
        }
    }

    public boolean deletePersonById(String id) {
        for (Person person : people) {
            if (person.id.equals(id)) {
                people.remove(person);
                return true;
            }
        }
        return false;
    }

    public void editPersonById(String id) {
        for (Person person : people) {
            if (person.id.equals(id)) {
                System.out.println("Editing person with ID: " + id);
                person.editPerson();
                return;
            }
        }
        System.out.println("No person found with ID: " + id);
    }
}

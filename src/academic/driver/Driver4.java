package academic.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import academic.model.Course;
import academic.model.Student;
import academic.model.Enrollment;

public class Driver4 {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] _args) {
        List<Course> courses = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        List<Enrollment> enrollments = new ArrayList<>();
        List<String> inputList = new ArrayList<>();
        
        do {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
            inputList.add(input);
        } while (true);
        
        for (String input : inputList) {
            String[] command = input.split("#");
            
            switch (command[0]) {
                case "course-add":
                    if (command.length == 5) {
                        Course course = new Course(command[1], command[2], Integer.parseInt(command[3]), command[4]);                        courses.add(course);
                    }
                    break;
                case "student-add":
                    if (command.length == 5) {
                         Student student = new Student(command[1], command[2], command[3], command[4]);
                        students.add(student);
                    }
                    break;
                case "enrollment-add":
                    if (command.length == 5) {
                         Enrollment enrollment = new Enrollment(command[1], command[2], command[3], command[4]);
                        enrollments.add(enrollment);
                    }
                    break;
                default:
                    break;
            }
        }
        
        for (Course course : courses) {
            System.out.println(course);
        }
        for (Student student : students) {
            System.out.println(student);
        }
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}

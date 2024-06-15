package academic.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import academic.model.Student;

public class Driver2 {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] _args) {
        List<Student> students = new ArrayList<>();
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
            
            if (command.length == 4) {
                Student student = new Student(command[0], command[1], command[2], command[3]);
                students.add(student);
            }
        }
        
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

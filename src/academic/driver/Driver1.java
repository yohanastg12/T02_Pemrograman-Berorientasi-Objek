package academic.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import academic.model.Course;

public class Driver1 {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] _args) {
        List<Course> courses = new ArrayList<>();
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
                Course course = new Course(command[0], command[1], Integer.parseInt(command[2]), command[3]);
                courses.add(course);
            }

               
        }
        
        for (Course course : courses) {
            System.out.println(course);
        }
    }
}

package academic.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import academic.model.Enrollment;

public class Driver3 {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] _args) {
        List<Enrollment> enrollments = new ArrayList<>();
        List<String> inputList = new ArrayList<>();
        
        do {
            String input = scanner.nextLine();
            if (input.equals("---")) {
                break;
            }
            inputList.add(input);
            
            String[] command = input.split("#");
            
            if (command.length >= 4) {
                Enrollment enrollment = new Enrollment(command[0], command[1], command[2], command[3]);
                enrollments.add(enrollment);
            }
            
        } while (true);
        
        for (Enrollment enrollment : enrollments) {
            System.out.println(enrollment);
        }
    }
}

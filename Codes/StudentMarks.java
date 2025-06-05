import java.util.*;
public class StudentMarks {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> studMap = new HashMap<>();
        
        System.out.println("Enter the number of students: ");
        int numStudents = scanner.nextInt(); 
        scanner.nextLine(); 

        // Take input for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student name: ");
            String name = scanner.nextLine();
            
            System.out.println("Enter marks for " + name + ": ");
            int marks = scanner.nextInt();
            scanner.nextLine(); 

            studMap.put(name, marks); 
        }

        // Output all student names and their marks
        System.out.println("\nStudent Marks: " + studMap);

        // Get the maximum marks from the map
        int maxMarks = Collections.max(studMap.values());

        // Find the names of students who got the maximum marks
        Set<String> topStudents = new HashSet<>();
        for (Map.Entry<String, Integer> entry : studMap.entrySet()) {
            if (entry.getValue() == maxMarks) {
                topStudents.add(entry.getKey());
            }
        }

        System.out.println("\nTop student(s) with highest marks (" + maxMarks + "): " + topStudents);

        // Ask the user if they want to check marks for a specific student
        while (true) {
            System.out.println("\nDo you want to check the marks of any student? (yes/no): ");
            String response = scanner.nextLine().toLowerCase();

            if (response.equals("yes")) {
                System.out.println("Enter the name of the student: ");
                String studentName = scanner.nextLine();

                if (studMap.containsKey(studentName)) {
                    System.out.println(studentName + "'s marks: " + studMap.get(studentName));
                } else {
                    System.out.println("Student not found. Please try again.");
                }
            } else if (response.equals("no")) {
                System.out.println("Exiting program.");
                break;
            } else {
                System.out.println("Invalid input. Please type 'yes' or 'no'.");
            }
        }

        int maximMarks = Collections.max(studMap.values());

        // Find the names of students who got the maximum marks
        Set<String> topStudent = new HashSet<>();
        for (Map.Entry<String, Integer> entry : studMap.entrySet()) {
            if (entry.getValue() == maxMarks) {
                topStudent.add(entry.getKey());
            }
        }

        System.out.println("\nTop student(s) with highest marks (" + maximMarks + "): " + topStudent);
    }
}

// Peter Migliore
// Friday, April 18
// Assignment 4 - Modularity and Classes
package CompSCi;

import java.io.*;
import java.util.*;

public class A4Q1 {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayOfReport = new ArrayList<String>();
        Scanner input = new Scanner(System.in);
        Scanner reader = new Scanner(new File("raw_marks.txt")); // Takes the given path to find the file that needs to be read.

        int counter = 0; // Initialize the counter used in the for loop.
        int option; // Initialize variable so it can be accessed outside the while loop.
        String first = ""; // Initialize each variable for the user input menu to allow the user to augment objects.
        String last = "";
        int math;
        int english;
        int science;
        int art;

        while (reader.hasNext()){ // Continues to loop while there is another string that can be read.
            arrayOfReport.add(reader.next());
        }
        reader.close(); // Close reader to prevent corruption.

        ArrayList<Student> students = new ArrayList<>(20); // ArrayList to store the objects of each student. There are 20 students so the capacity will be initialized at 20.

        for (int i = 8; i < arrayOfReport.size() ; i += 6) {
            Student student = new Student(); // Create a new Student object.
            student.setName(arrayOfReport.get(i), arrayOfReport.get(i + 1) ); // Stores the names of each student into the object.
            student.setMark(1, Integer.parseInt(arrayOfReport.get(i + 2))); // Stores the math grade of the student, by using parse int, into the object.
            student.setMark(2, Integer.parseInt(arrayOfReport.get(i + 3))); // Stores the english grade of the student, by using parse int, into the object.
            student.setMark(3, Integer.parseInt(arrayOfReport.get(i + 4))); // Stores the science grade of the student, by using parse int, into the object.
            student.setMark(4, Integer.parseInt(arrayOfReport.get(i + 5))); // Stores the art grade of the student, by using parse int, into the object.
            students.add(student); // Add the student to the ArrayList.
            counter++; // The counter is used to keep track of which student this loop is currently on.
        }
        while(true){// Try and Catch statement to make sure user enters a valid option.
            // Prints the menu of options for the user to enter, if the option entered is incorrect, restarts the loop.
            System.out.println("1: Add a new Student\n" +"2: Remove a Student\n" + "3: Update a Student’s Info\n" + "4: Show a Student’s Average Mark\n" + "5: Show a Student’s Highest Mark\n" + "6: Print a Student’s Report Card on the screen\n" + "7: Print a Student’s Report Card to a file (<lastname>.txt)\n" +  "8: Print a Class List (sorted alphabetically by last name)\n" + "0: Exit ");

            try{ // Handle invalid input.
                option = input.nextInt();
                if (option > 8 || option <0){
                    System.out.println("Please enter a given option");
                    input.nextLine(); // Clears the input field to prevent infinite loop.
                    continue;
                }
            } catch (Exception e){
                System.out.println("Please enter a given option");
                input.nextLine(); // Clears the input field to prevent infinite loop.
                continue;
            }
            // Process user's menu selection.
            switch (option){
                case 0:
                    System.out.println("Thanks for using the program!");
                    System.exit(0);
                    break;

                case 1:
                    try{ // Ask for each attribute of a student.
                        System.out.println("Enter the first name of the student: ");
                        first = input.next();

                        System.out.println("Enter the last name of the student: ");
                        last = input.next();

                        System.out.println("Enter the math mark of the student: ");
                        math = input.nextInt();

                        System.out.println("Enter the english mark of the student: ");
                        english = input.nextInt();

                        System.out.println("Enter the science mark of the student: ");
                        science = input.nextInt();

                        System.out.println("Enter the art mark of the student: ");
                        art = input.nextInt();
                        input.nextLine(); // Clears the input field to prevent infinite loop.
                    }catch(Exception e){
                        System.out.println("Please enter integers for the marks and characters for the name.");
                        input.nextLine(); // Clears the input field to prevent infinite loop.
                        continue;
                    }

                    addStudent(students, first, last, math, english, science, art);
                    break;

                case 2: // Removes a student from the array.
                    System.out.println("Enter the number of the student you would like to remove.");
                    System.out.println("There are currently " + students.size() + " students.");

                    int kidRemove = input.nextInt();
                    if (kidRemove > students.size() || kidRemove < 0){ // Checks to make sure the number is found in the array.
                        System.out.println("That is not a student in the array.");
                        break;
                    }

                    removeStudent(kidRemove-1, students);
                    break;

                case 3: // Update student info.
                    System.out.println("Enter the number of the student you would like to update: ");

                    int kidUpdate = input.nextInt();
                    if (kidUpdate > students.size() || kidUpdate < 0){ // Validate that the input is acceptable when compared to the array size.
                        System.out.println("That is not a student in the array.");
                        break;
                    }

                    try{ // Ask for the new attributes of the student.
                        System.out.println("Enter the first name of the student: ");
                        first = input.next();

                        System.out.println("Enter the last name of the student: ");
                        last = input.next();

                        System.out.println("Enter the math mark of the student: ");
                        math = input.nextInt();

                        System.out.println("Enter the english mark of the student: ");
                        english = input.nextInt();

                        System.out.println("Enter the science mark of the student: ");
                        science = input.nextInt();

                        System.out.println("Enter the art mark of the student: ");
                        art = input.nextInt();
                        input.nextLine(); // Clears the input field to prevent infinite loop.
                    }catch(Exception e){
                        System.out.println("Please enter integers for the marks and characters for the name.");
                        input.nextLine(); // Clears the input field to prevent infinite loop.
                        continue;
                    }

                    updateStudent(kidUpdate-1, students, first, last, math, english, science, art);
                    break;

                case 4: // Show a student's average mark
                    System.out.println("Enter the student number that you want the average of: ");
                    int kidAverage = input.nextInt();
                    if (kidAverage > students.size() || kidAverage < 0){ // Checks if the value is accepted as per the array.
                        System.out.println("That is not a student in the array.");
                        break;
                    }
                    System.out.println("The average of the student is: " + averageMark(kidAverage-1, students));
                    break;

                case 5:
                    System.out.println("Enter the student number that you want the highest mark of: ");
                    int kidHighest = input.nextInt();
                    if (kidHighest > students.size() || kidHighest < 0){ // Validate that the input is acceptable when compared to the array size.
                        System.out.println("That is not a student in the array.");
                        break;
                    }

                    System.out.println("The highest mark of the student is: " + bestMark(kidHighest-1, students));
                    break;

                case 6:
                    System.out.println("Enter the number of the student that you want the report card of: ");
                    int kidReport = input.nextInt();
                    if (kidReport > students.size() || kidReport < 0){ // Validate that the input is acceptable when compared to the array size.
                        System.out.println("That is not a student in the array.");
                        break;
                    }

                    System.out.println(reportCard(kidReport-1, students));
                    break;

                case 7:
                    System.out.println("Enter the number of the student that you want the report card file of: ");
                    int kidReportFile = input.nextInt();
                    if (kidReportFile > students.size() || kidReportFile < 0){ // Validate that the input is acceptable when compared to the array size.
                        System.out.println("That is not a student in the array.");
                        break;
                    }

                    fileOutput(kidReportFile-1, students);
                    break;

                case 8:
                    System.out.println(classList(students));
            }
        }
    }

    public static void addStudent(ArrayList<Student> classroom, String fn, String ln, int mark1, int mark2, int mark3, int mark4){
        Student s = new Student();
        s.setName(fn, ln); // Set student name and marks.
        s.setMark(1, mark1);
        s.setMark(2, mark2);
        s.setMark(3, mark3);
        s.setMark(4, mark4);
        classroom.add(s); // Add student to ArrayList.
    }
    public static void removeStudent(int num, ArrayList<Student> classroom){
        classroom.remove(num);
    }
    public static void updateStudent(int num, ArrayList<Student> classroom, String fn, String ln, int mark1, int mark2, int mark3, int mark4){
        classroom.get(num).setName(fn, ln);  // Change name
        classroom.get(num).setMark(1, mark1); // Update marks.
        classroom.get(num).setMark(2, mark2);
        classroom.get(num).setMark(3, mark3);
        classroom.get(num).setMark(4, mark4);
    }

    public static int averageMark(int num, ArrayList<Student> classroom){
        return classroom.get(num).getAverage();
    }

    public static int bestMark(int num, ArrayList<Student> classroom){
        return classroom.get(num).getHighestMark();
    }

    public static String reportCard(int num, ArrayList<Student> classroom){
        return classroom.get(num).toString();
    }

    public static void fileOutput(int numStudent, ArrayList<Student> classroom)throws IOException {
        String name = classroom.get(numStudent).getName(); // Gets the name of the student.
        String cut = name.split(",")[0].trim(); //Split, splits the name into an array of substrings. It figures out where to split by using a provided character which is comma. [0] accesses the first element of the substring array being the last name. FFinally trim() removes all white space from the last name.

        PrintWriter writer = new PrintWriter(cut+".txt"); // Creates a file with the last name.
        writer.println(classroom.get(numStudent).toString()); //Writes to the file, the report card.
        writer.close(); // Close the writer to prevent error.
    }

    public static String classList(ArrayList<Student> classroom){
        String[] arrayOfNames = new String[classroom.size()];
        for (int i = 0; i < classroom.size(); i++){ // For loop adds each name from the arraylist to a string array to sort and print it later on.
            String name = classroom.get(i).getName();
            arrayOfNames[i] = "("+ name+")"; // Added parenthesis to make formatting more readable.
        }

        Arrays.sort(arrayOfNames); //Sorts the array alphabetically by last name.
        return Arrays.deepToString(arrayOfNames);
    }
}

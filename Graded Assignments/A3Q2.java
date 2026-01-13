// Peter Migliore
// Monday, February 17
// Assignment 3 - File Input and Output

package CompSCi;

import java.io.*;
import java.util.*;

public class A3Q2 {
    public static void main(String[] args) throws IOException {
        reportCard(averageCourseCalculator(readFile("raw_marks.txt")), averageGradeCalculator(readFile("raw_marks.txt")), readFile("raw_marks.txt"));

    }

    public static ArrayList<String> readFile (String path) throws IOException{
        ArrayList<String> arrayOfReport = new ArrayList<String>();
        Scanner reader = new Scanner(new File(path)); // Takes the given path to find the file that needs to be read.

        while (reader.hasNext()){ // Continues to loop while there is another string that can be read.
            arrayOfReport.add(reader.next());
        }
        reader.close(); // Close reader to prevent corruption.
        return arrayOfReport;
    }

    public static ArrayList<Integer> averageGradeCalculator(ArrayList<String> arrayOfGrades){
        ArrayList<Integer> average = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) { // Initialize the ArrayList to prevent an error when trying to ArrayList.set a non-existent element.
            average.add(0);
        }

        int counter = 10; // The array grades begin at the 10th array position, this counter ensures the code starts parsing data from that point onwards.

        for (int i = 0; i < 20; i++) {
            int originalCount = counter; // Keep a copy of the starting position for each student, this is to gauge when to end the loop to take only 4 numbers per student.
            while (true){
                average.set(i, average.get(i) + Integer.parseInt(arrayOfGrades.get(counter))); // Finds the sum of all class marks per student.
                if (counter == originalCount + 3){ // After passing through the four grades, move 3 places forward in the array to the next four marks.
                    counter += 3;
                    average.set(i, average.get(i)/4); // Divide the sum of the class marks by four classes. This gives the average.
                    break;
                }
                counter++; // Passes through each element of the array.
            }

        }
        return average;
    }

    public static ArrayList<Integer> averageCourseCalculator(ArrayList<String> arrayOfGrades){
        ArrayList<Integer> courseAverage = new ArrayList<Integer>();

        for (int i = 0; i < 4; i++) { // Initialize the ArrayList again.
            courseAverage.add(0);
        }

        int math = 0;
        int english = 0;
        int science = 0;
        int art = 0;

        for (int i = 8; i < arrayOfGrades.size() ; i += 6) { // This loop begins at index 8 of the grades array and each grade is saved from each subject.
            math += Integer.parseInt(arrayOfGrades.get(i+2)); // 2, 3, 4, or 5 is added to the initial index, this allows the mark for each grade to be found.
            english += Integer.parseInt(arrayOfGrades.get(i+3)); // +6 is added to the index each iteration to move on to the next student.
            science += Integer.parseInt(arrayOfGrades.get(i+4));
            art += Integer.parseInt(arrayOfGrades.get(i+5));
        }

        courseAverage.set(0, math / 20); // Divides the sum of all grades of each subject by 20 students to find the average for each.
        courseAverage.set(1, english / 20);
        courseAverage.set(2, science / 20);
        courseAverage.set(3, art / 20);

        return courseAverage;
    }

    public static void reportCard (ArrayList<Integer> averageCourseCalculator, ArrayList<Integer> averageGradeCalculator, ArrayList<String> arrayOfGrades) throws IOException {
        int counter = 0;
        for (int i = 8; i < arrayOfGrades.size() ; i += 6) {

            String name = arrayOfGrades.get(i+1).toLowerCase() + ".txt"; // Uses a loop similar to the previous method, this takes the lastname of each student, makes it lower case and uses it to name the corresponding txt file.
            String firstName = arrayOfGrades.get(i); // Stores the firstname of each student as a variable.
            String lastName = arrayOfGrades.get(i + 1); // Stores the lastname of each student as a variable.

            int math = Integer.parseInt(arrayOfGrades.get(i + 2));
            int english = Integer.parseInt(arrayOfGrades.get(i + 3));
            int science = Integer.parseInt(arrayOfGrades.get(i + 4));
            int art = Integer.parseInt(arrayOfGrades.get(i + 5)); // Takes the grade of each subject for the students report cards and saves them as a variable.
            int average = averageGradeCalculator.get(counter); // Takes the overall average of each student's grades and stores them as a variable.

            PrintWriter writer = new PrintWriter(name);

            if (counter == 5){ // Made a separate report card for Romanoff, due to her 100% messing up the report card formating.
                writer.println("Student Name: " + lastName + ", " + firstName + "\n" + "Average Mark: " + average + "\n\n" + "Course:       " + "Final Mark:       " + "Course Average:       " + "\n======        ===="  + "=======       ===" + "============" + "\nMath          " + math +"               " + averageCourseCalculator.get(0)+ "\nEnglish       " + english + "                " + averageCourseCalculator.get(1) +  "\nScience" + "       " + science + "                " +
                        averageCourseCalculator.get(2) + "\nArt" + "           " + art + "                " + averageCourseCalculator.get(3));

            }
            else { // Full formatted report card which is created for each student.
                writer.println("Student Name: " + lastName + ", " + firstName + "\n" + "Average Mark: " + average + "\n\n" + "Course:       " + "Final Mark:       " + "Course Average:       " + "\n======        ===="  + "=======       ===" + "============" + "\nMath          " + math +"                " + averageCourseCalculator.get(0)+ "\nEnglish       " + english + "                " + averageCourseCalculator.get(1) +  "\nScience" + "       " + science + "                " +
                        averageCourseCalculator.get(2) + "\nArt" + "           " + art + "                " + averageCourseCalculator.get(3));

            }
            writer.close(); // Close the writer to prevent error.
            counter++; // The counter is used to keep track of which student this loop is currently on.
        }
    }
}


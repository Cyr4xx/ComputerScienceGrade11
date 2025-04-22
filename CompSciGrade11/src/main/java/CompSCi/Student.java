// Peter Migliore
// Friday, April 18
// Assignment 4 - Modularity and Classes
package CompSCi;

public class Student {

    //The instance variables for the attributes of the student.
    private String firstName;
    private String lastName;
    private int course1;
    private int course2;
    private int course3;
    private int course4;

    // Constructor method that initializes each variable.
    public Student(){
        firstName = "";
        lastName = "";
        course1 = 0;
        course2 = 0;
        course3 = 0;
        course4 = 0;
    }

    // this. allows one to use the same variable names in a method as the instance ones, this helps reduce clutter and confusion.
    // Set each variable to given values by the user.
    public Student (String firstName, String lastName, int course1, int course2, int course3, int course4){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
    }

    // Initialize variables to match those in parameter s.
    public Student (Student s) {
       firstName = s.firstName;
        lastName = s.lastName;
        course1 = s.course1;
        course2 = s.course2;
        course3 = s.course3;
        course4 = s.course4;
    }

    // Sets the name of a specific student.
    public void setName(String first, String last){
        firstName = first;
        lastName = last;
    }

    // Gets the name of a specified student.
    public String getName(){
        return lastName +", " + firstName;
    }

    // Sets the mark of a specified course.
    public void setMark(int course, int mark){
        if (course==1) course1=mark;
        else if (course==2) course2=mark;
        else if (course==3) course3=mark;
        else if (course==4) course4=mark;
    }
    // Gets the mark of a specified course.
    public int getMark(int course){
        int score;
        if (course==1) score=course1;
        else if (course==2) score=course2;
        else if (course==3) score=course3;
        else score=course4;
        return score;
    }
    // Gets the average of a specified student.
    public int getAverage(){
        return (getMark(4) + getMark(3) + getMark(2) +getMark(1)) / 4;
    }

    // Gets the highest mark of a specified student.
    public int getHighestMark(){
        int highMark;
        if (course1>course2 && course1>course3 && course1>course4){ highMark=course1; }
        else if (course2>course1 && course2>course3 && course2>course4){ highMark=course2; }
        else if (course3>course2 && course3>course1 && course3>course4){ highMark=course3; }
        else highMark=course4;
        return highMark;
    }
    // Constructs the string into a report card format.
    public String toString() {
        String card = "";
        if (lastName.equals("Romanoff")) { // Made a separate report card for Romanoff, due to her 100% messing up the report card formating.
            card = "Student Name: " + lastName + ", " + firstName + "\n" + "Average Mark: " + getAverage() + "\n\n" + "Course:       " + "Final Mark:       " + "\n======        ====" + "=======       " + "\nMath          " + getMark(1) + "\nEnglish       " + getMark(2) + "\nScience" + "       " + getMark(3)
                    + "\nArt" + "           " + getMark(4);

        } else { // Full formatted report card.
            card = "Student Name: " + lastName + ", " + firstName + "\n" + "Average Mark: " + getAverage() + "\n\n" + "Course:       " + "Final Mark:       " + "\n======        ====" + "=======       " + "\nMath          " + getMark(1) + "\nEnglish       " + getMark(2)+ "\nScience" + "       " + getMark(3)
                    + "\nArt" + "           " + getMark(4);

        }
        return card;
    }





}
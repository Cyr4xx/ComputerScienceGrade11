package CompSCi;

public class Student {

    private String firstName;
    private String lastName;
    private int course1;
    private int course2;
    private int course3;
    private int course4;

    public Student(){
        firstName = "";
        lastName = "";
        course1 = 0;
        course2 = 0;
        course3 = 0;
        course4 = 0;
    }

    public Student (String firstName, String lastName, int course1, int course2, int course3, int course4){
        this.firstName = firstName;
        this.lastName = lastName;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.course4 = course4;
    }
    public Student (Student s) {
        name = s.name;
        test1 = s.test1;
        test2 = s.test2;
        test3 = s.test3;
    }

    public void setName(String sm){
        name = sm;
    }
    public String getName(){
        return name;
    }

    public void setScore(int i, int score){
        if (i==1) test1=score;
        else if (i==2) test2=score;
        else if (i==3) test3=score;
    }
    public int getScore(int i){
        int score;
        if (i==1) score=test1;
        else if (i==2) score=test2;
        else score=test3;
        return score;
    }
    public int getAverage(){
        return (getScore(3) + getScore(2) + getScore(1)) / 3;
    }
    public int getHighScore(){
        int highScore;
        if (test1>test2 && test1>test3){ highScore=test1; }
        else if (test2>test1 && test2>test3){ highScore=test2; }
        else highScore=test3;
        return highScore;
    }
    public String toString(){
        return name + " " + test1 + " " + test2 + " " + test3;


    }





}
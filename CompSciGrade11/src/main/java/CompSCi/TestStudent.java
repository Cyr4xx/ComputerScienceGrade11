package CompSCi;

public class TestStudent extends Student {
    public static void main (String[] args){
        Student s1, s2;

        s1 = new Student();
        s1.setName("Bill");
        s1.setScore(1, 84);
        s1.setScore(2, 86);
        s1.setScore(3, 88);
        System.out.println("\n Here is student s1\n" + s1);

        s2 = s1;
        s2.setName("Ann");
        System.out.println("\n Name of s1 is now : " + s1.getName());

        System.out.println("Test scores = " + s1.getScore(1) + " " + s1.getScore(2) + " " + s1.getScore(3));
        System.out.println(s1.getName());
        System.out.println(s1.getAverage());
        System.out.println(s1.toString());
    }
}

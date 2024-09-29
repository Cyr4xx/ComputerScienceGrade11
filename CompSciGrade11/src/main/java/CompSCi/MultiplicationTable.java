package CompSCi;

public class MultiplicationTable {
    public static void main(String[] args) {
        int size = 12;

        for (int i = 1; i <= size; i++) {
            System.out.print(i + " | ");
            for (int j = 1; j <= size; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

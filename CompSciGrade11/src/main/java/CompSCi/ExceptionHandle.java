package CompSCi;

import java.util.*;

public class ExceptionHandle {
    public static void main(String[] args){
        boolean correctInput = false;
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<Double>();
        ArrayList<Double> list2 = new ArrayList<Double>();
        Random random = new Random();
        double num1 = 0;
        double num2 = 0;
        for (int i = 0; i < 50; i++){
            num1 = random.nextInt(9);
            list.add(num1);
        }
        System.out.println(list);
        System.out.println("Please enter a number between 1 - 10:");
        while (!correctInput){
            try {
                num2 = input.nextInt();
                if (num2 > 10 || num2 < 1){
                    System.out.println("WRong input");
                    continue;
                }
                correctInput = true;
            } catch (Exception e) {
                input.nextLine();
                System.out.println("Thats not an integer");
                System.out.println("Enter an integer: ");
            }
        }
        for (int j = 0; j < 50; j++){
            Double num3 = list.get(j) / num2;
            list2.add(num3);
        }
        System.out.println(list2);


    }
}

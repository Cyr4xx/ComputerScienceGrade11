package CompSCi;

import java.util.*;

public class arrayRandom {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random random = new Random();
        int num = 0;
        int num2 = 0;
        for (int i = 0; i < 50; i++){
            num = random.nextInt(50)+1;
            list.add(num);
        }
        System.out.println(list);

        System.out.println("Enter a number between 1-10: ");
        int num1 = input.nextInt();
        if (num1 > 10 || num1 < 1){
            System.out.println("Invalid");
            System.exit(0);

        }
        for (int j = list.size() - 1; j >= 0; j--){
           num2 = list.get(j);
           if(num2 % num1 != 0){
               list.remove(j);
           }
        }
        System.out.println(list);

    }
}

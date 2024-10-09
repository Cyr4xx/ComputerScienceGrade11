package CompSCi;

import java.util.*;

public class FastFood {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int order = 0;
        double price = 0;
        do {
            System.out.println("1. Hamburger 6.99 \n2. Pizza 2.99 \n3. Orange 0.99 \n4. Cake 3.99 \n5. Pita 9.99 \n6. Kombucha 1.99 \n7. EXIT");
            order = input.nextInt();
            switch(order){
                case 1:
                    price += 6.99;
                    break;

                case 2:
                    price += 2.99;
                    break;

                case 3:
                    price +=0.99;
                    break;

                case 4:
                    price += 3.99;
                    break;

                case 5:
                    price += 9.99;
                    break;

                case 6:
                    price += 1.99;
                    break;

                default:
                    System.out.println("Invalid Input");
                    System.exit(0);
            }
        } while(order != 7);

    }
}

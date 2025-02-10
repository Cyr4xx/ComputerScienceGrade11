package CompSCi;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }else if  (sum + num >= 1000){
                sum += num;
                sum -= 1000;
                break;
            }else {
                sum +=  num;
            }
        }
        System.out.println(sum);
    }
}
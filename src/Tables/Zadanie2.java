package Tables;

import java.io.IOException;
import java.util.Scanner;
public class Zadanie2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int prices[] = new int[5];


        for(int j=1; j<=5; j++) {
            System.out.print("Please provide price for product " + j + ": ");
            int pp = scanner.nextInt();
            prices[j-1] = pp;
        }

        for(int i = 0; i <= 4; i++) {
            System.out.println(prices[i]);
        }

        int sum = 0;

        for(int i = 0; i <= 4; i++) {
            sum += prices[i];
        }

        int average = sum / 5;

        System.out.print("Average = (" + prices[0] + "+"+ prices[1] + "+"+ prices[2] + "+"+ prices[3] + "+"+ prices[4] + ")/ 5 = " + average);

    }





}


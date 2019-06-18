package Poczatki_petle_ciagfib_foobar;

import java.io.IOException;
import java.util.Scanner;

public class Zadanie {


    public static void main(String[] args)  {

        Scanner console = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double number1 = console.nextInt();
        System.out.print("Enter second number: ");
        double number2 = console.nextInt();

        if (number1 == number2)
            System.out.println("EQUAL");
        else
        {
            if (number1 > number2)
                System.out.println("FIRST NUMBER IS GREATER");
            else
                System.out.println("SECOND NUMBER IS GREATER");
        }




    }
}

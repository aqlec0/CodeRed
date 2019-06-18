package Poczatki_petle_ciagfib_foobar;

import java.util.Scanner;
import java.util.Random;

public class L3 {


    public static void main(String[] args) {

        System.out.println(discount(10, 20, 0.2));

        for (double i = 0; i <= 1; i = i + 0.1) {
            System.out.println(discount(10, 20, i));
        }


        for (int i = 1; i <= 10; i++) {
            System.out.println(Math.pow(2, i));
            print(i);
        }

        kwadrat(10);

        int position = 100;
        int wall = new Random().nextInt(5000);

        while (position > wall) {
            System.out.println(position + ":" + wall + ": Still riding");
            wall = new Random().nextInt(5000);
        }

        System.out.println(position + ":" + wall + "Race finished");

        // zadanie napisac program na ciag Fibbonacciego, min 100 tych liczb, w petli for
        // wypisac ciag liczb, foo bar, foo jak sie dzieli przez 3 , bar jak prze 5


    }

    public static void kwadrat(int a) {
        horizontalline(a);
        for (int i = 0; i < a; i++) {
            verticalline(a);
        }
        horizontalline(a);

    }

    public static void horizontalline(int a) {
        for (int i = 0; i < a; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void verticalline(int a) {
        System.out.print("|");
        for (int i = 0; i < a - 2; i++) {
            System.out.print(" ");
        }
        System.out.println("|");
    }

    public static void print(int input) {
        System.out.println("Hello " + input);
    }

    public static double discount(int qty, int price, double disc) {
        double finalprice = qty * price * (1 - disc);
        return finalprice;
    }

}
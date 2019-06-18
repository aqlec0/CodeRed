package Inne;

import java.io.IOException;
import java.util.Scanner;

public class Sklep {

    public static void main(String[] args)  {


        String przedmiot1;
        String przedmiot2;

        int cena1 = 2;
        int cena2 = 3;

        int ilosc1 = 50;
        int ilosc2 = 80;

        System.out.print("Cena za przemiot 1: ");
        System.out.println(cena1*ilosc1);

        System.out.print("Cena za przemiot 2: ");
        System.out.println(cena2*ilosc2);

        //double coupon1 = 10;
        //double coupon2 = 20;

        Scanner console = new Scanner(System.in);
        System.out.print("Enter coupon 1 : ");
        double coupon1 = console.nextInt();
        if (coupon1 < 0 || coupon1 > 100)
            System.out.println("Invalid Coupon!");
        else
        {
            double finalPrice1 =  cena1 * ilosc1 - cena1 * ilosc1 *(coupon1 / 100);
            System.out.println(finalPrice1);
        }


        Scanner console2 = new Scanner(System.in);
        System.out.print("Enter coupon 2 : ");
        double coupon2 = console2.nextInt();
        if (coupon2 < 0 || coupon2 > 100)
            System.out.println("Invalid Coupon!");
        else
        {
            double finalPrice2 = cena2 * ilosc2 - cena2 * ilosc2 * (coupon2 / 100);
            System.out.println(finalPrice2);
        }


    }
}

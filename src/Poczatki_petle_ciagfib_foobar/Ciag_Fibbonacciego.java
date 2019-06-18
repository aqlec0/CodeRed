package Poczatki_petle_ciagfib_foobar;

import java.util.Random;

public class Ciag_Fibbonacciego {

    public static void main(String[] args) {

        int n = 60;
        long result = Ciag_Fibbonacciego(n);
        System.out.print(result);
        long value[] = new long[n];

        FooBar(20);
    }


    public static long Ciag_Fibbonacciego(int a){
        long b = 1, n = 1;
        //System.out.print("1, ");
        for(int i = 0; i < a; i++) {
            long t = n;
            n = b;
            b += t;
            //System.out.print(b + ", ");
        }
        return b;

    }



    public static void FooBar(int n){
        for(int i=1;i<=n;i++){

            if(i%5!=0 && i%3!=0){
                System.out.println(i);
                continue;
            }
            if(i%5==0 && i%3==0){
                System.out.println(i + "FooBar");
                continue;
            }
            if(i%3==0){
                System.out.println(i + "Foo");
            }
            if(i%5==0){
                System.out.println(i + "Bar");
            }

        }
    }

}


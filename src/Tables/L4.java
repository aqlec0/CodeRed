package Tables;

import java.util.Random;

public class L4 {

    public static void main(String[] args) {

        /*int n = 60;

        long[] fibvalues = Poczatki_petle_ciagfib_foobar.Ciag_Fibbonacciego(n);

        for( int i=0; i<=n-1; i++){ // musi byc -1 bo tablica jest do 60, a prpbujemy wrzucic 61 gdyby bylo n
            System.out.println(i + ":" + fibvalues[i]);
        }*/

        int n = 10;
        long[] tabvalues = table(n);

        for( int i=0; i<=n-1; i++){
            System.out.print(i + ":" + tabvalues[i] + " ");
            if(i%3==0)
                System.out.println("TRUE" );
            else
                System.out.println("FALSE" );
        }





    }

    public static long[] table(int n){

        long value[] = new long[n];
        //boolean value[] = new boolean[n]; //stworzyc tablice bolean

        for(int i = 0; i <= n-1; i++) {
            value[i] = i * 3;
        }
        return value;

    }


    public static long[] Ciag_Fibbonacciego(int n){

        long value[] = new long[n];
        value[0] = 0;
        value[1] = 1;

        for(int i = 2; i < n; i++) {
            // an = an-1 + an-2
            value[i] = value[i-1] + value[i-2];

        }
        return value;

    }





}


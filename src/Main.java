import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        //System.out.println("Szkolenie z Java!");
        //System.out.println("Druga linijka :)");

        // 1 option

       // BufferedReader br = null;
        // br = new BufferedReader(new InputStreamReader(System.in));

        //System.out.print("Enter your name : ");
        //String input = br.readLine();
        //System.out.print("Hi " + input + ":)");

        // 2 option

        //System.out.print("Enter your name : ");
        //Scanner name = new Scanner(System.in);
        //String line = input.nextLine();
        //System.out.println("Hi " + input + ":)");

        //int x = 102;
        //int y = 203;

        //System.out.println(x+y);

        //System.out.println(countLetters("Agnieszka"));

        //System.out.print("Podaj 1 liczbe : ");
        //Int l1 = new Scanner(System.in);
        //String line = l1.nextLine();

        //System.out.print("Podaj 2 liczbe : ");
        //Int l2 = new Scanner(System.in);
        //String line2 = l2.nextLine();

        //int w;
        //w = Dodawanie(2,7);

        //System.out.print("Wynik dodawania:" +  w);

        int x = 9;
        if (x==10){
            System.out.print("Tak");
        }
        else
            System.out.print("Nie");


    }

    static int countLetters (String x){

        return x.length();
    }

    static int Dodawanie(int a, int b){
        int wynik;
        wynik=a+b;
        return wynik;
    }

    //  napisac kalkukator, wypisac liczby i je dodac, jak czytac strings i jak czytac liczby




}
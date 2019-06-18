package Boolean_chars;

public class lesson_Boolean {


    public static void main(String[] args) {

        /*boolean isItfriday = false;
        double sroot = Math.PI;
        System.out.println(sroot);

        boolean isItsunday = true;
        boolean isItSaturday = false;
        boolean isItweekend = isItsunday || isItSaturday;

        //System.out.println(isItweekend);

        //System.out.println(isSingleDigit(5));*/

        String myValue = "Test";
        myValue.charAt(3);
        System.out.println(myValue.charAt(3));

        System.out.println(isSecondCharAorB("aaaaaaaaa"));
        System.out.println(isSecondCharAorB("ccccccccc"));



    }

    public static boolean isSecondCharAorB(String n){

        String value = n;


        if(value.charAt(1) == 'a'  || value.charAt(1)=='b')
            return true;
        return false;
    }


    public static boolean isSingleDigit(int n){

        if(n>-10 && n<10)
            return true;
        return false;
    }
}

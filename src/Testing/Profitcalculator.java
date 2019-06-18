package Testing;

public class Profitcalculator {

    public int calculate(int [] array){
        //int [] values = [1,20,300];
        //        //int value[] = new int[n];
        int sum = 0;
        for(int i=0;i<3;i++){
            System.out.println(array[i]);
            sum += array[i];
        }
        return sum;
    }
}

package Game_Class;

public class Cow {

    int weight;
    int foodlevel;
    int children;

    public Cow(){
        weight = 500;
        foodlevel = 0;
        children = 0;
    }

    public int getMilk(){
        int milkProfit = ((weight / 10) + (foodlevel) - children) * 10;
        return milkProfit;
    }






}

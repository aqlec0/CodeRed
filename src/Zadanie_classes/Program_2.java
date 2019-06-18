package Zadanie_classes;

public class Program_2 {

    public static void main(String[] args) {

    FarmingField f1 = new FarmingField();
    FarmingField f2 = new FarmingField();

    StrawberryField s1 = new StrawberryField();

    EnhancedField e1 = new EnhancedField();
    EnhancedField e2 = new EnhancedField();

    FarmingField [] pole = {f1, f2, s1, e1, e2};

    for ( FarmingField a: pole)
    {
        System.out.println(a.calculateProfit());
    }




    }


}

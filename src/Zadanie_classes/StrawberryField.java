package Zadanie_classes;

import Zadanie_classes.FarmingField;

import java.util.Random;

public class StrawberryField extends FarmingField {

    Random random = new Random();
    int snailsRisk = random.nextInt(10);

    public int calculateProfit() {

        if(snailsRisk >= 5)
            baseProfitAfterHarvest = 0;

        return baseProfitAfterHarvest*2;
    }
}
// test merge

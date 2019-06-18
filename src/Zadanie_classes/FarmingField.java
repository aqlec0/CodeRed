package Zadanie_classes;

import java.util.Random;

public class FarmingField {

    public int sowingCost = 20;
    public int baseProfitAfterHarvest = 100;

    Random random = new Random();
    int droughtRisk = random.nextInt(100);

    public int calculateProfit(){
        if (droughtRisk >= 50)
            return 0;
        return baseProfitAfterHarvest;
    }
}



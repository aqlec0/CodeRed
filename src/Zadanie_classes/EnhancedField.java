package Zadanie_classes;

import Zadanie_classes.FarmingField;

public class EnhancedField extends FarmingField {

    public int enhancementMultiplier = 10;

    public int calculateProfit() {

       return baseProfitAfterHarvest*enhancementMultiplier;
    }

}

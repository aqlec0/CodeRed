package Game_Class;

public class EnhancedFieldGame extends Field {

    public int enhancementMultiplier = 10;

    @Override
    public int calculateProfit() {

        return baseProfit*enhancementMultiplier;
    }

}

package Game_Class;

import java.util.Random;

public class StrawberryF extends Field {

    int snailsRisk = 20; //20% that snails will eat entire crop

    @Override
    public int calculateProfit() {
        Random r = new Random();
        int totallyRandomNumber = r.nextInt(100);

        if(totallyRandomNumber < snailsRisk) {
            //oh noes, snails have attacked
            return 0;
        }

        //no snails - returning base profit * 2 as strawberries are more expensive to standard crop!
        return baseProfit  * 2;
    }
}
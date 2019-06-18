package Game_Class;

import java.util.Random;

public class RandomEvent {

    int lotteryPrize = 1000;
    int miceCleanupCost = 200;


    public static void main(String[] args) {

       Inventory inventoryRandom = new Inventory();
       applyLuck(inventoryRandom);

    }



    public static void applyLuck( Inventory inventory){

        Random r = new Random();
        int randomNumber = r.nextInt(5)+1;

        Inventory inventoryRandom = new Inventory();

        switch (randomNumber){
            case 1:
                System.out.println("You won lotteryPrize on lottery");
                //inventoryRandom.money = inventoryRandom.money + inventoryRandom.lotteryPrize;
                break;
            case 2:

                break;
            case 3:
                System.out.println("You inherited a field from a relative");
                inventoryRandom.buySimplerField();
                break;
            case 4:
                break;
            case 5:
                break;

            default: System.out.println("Wrong number!");
        }


    }

    /*
    n this method generate random number from 1 – 5
If the number is 1 then display info that user won lotteryPrize on lottery and add it to inventory
If the number is 2 then display info that mice infested the granary and it costs miceCleanupCost to remove them (subtract from Inventory)
If the number is 3 then display info that the user inherited a field from a relative and add standard field to inventory
If the number is 4 or 5 do nothing


Yes, use switch statement J



Create new RandomEvent object in Game and call it in 'nextTurn()' so that your random events are applied
     */

    /*
     * Losowanie liczb odbywa się po wywołaniu którejś z metod obiektu r
     * (klasy Random).
     * W zależności od typu liczby, którą należy wylosować, trzeba wybrać
     * odpowiednią metodę np.
     *     r.nextInt() - wylosuje liczbę całkowitą z zakresu int,
     *     r.nextFloat() - wylosuje liczbę rzeczywistą z zakresu float,
     *     itd. lista dostępnych metod klasy Random wyświetli się po
     *     wpisaniu nazwy obiektu i kropki w tym przypadku: r.
     *
     * W przypadku zapisu r.nextInt(n); wylosowana zostanie liczba z
     * zakresu od 0 do n-1, czyli chcąc wylosować liczbę z zakresu
     * od 1 do 10 (domkniętego) należy zapisać:
     * r.nextInt(10)+1;
     */
}

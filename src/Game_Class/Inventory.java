package Game_Class;

import java.util.ArrayList;

public class Inventory {

    int money;

    ArrayList<Field> fields = new ArrayList<>();
    ArrayList<Cow> cows = new ArrayList<>();


    public Inventory()
    {
        money = 1000;
    }

    public void buySimplerField(){

        System.out.println("Buying fields");
        Field field = new Field();
        fields.add(field);

        if(money < field.sowingCost) {
            System.out.println("Not enough money");
        }
        else
        money = money - field.sowingCost;
        System.out.println(money);
    }

    public void buyStrawberryField() {
        System.out.println("Buying Strawberry Field");
        StrawberryF strawberryF = new StrawberryF();
        fields.add(strawberryF);
        money = money - strawberryF.sowingCost;
        System.out.println(money);
    }

    public void buyEnhancementFieldGame() {
        System.out.println("Buying Enhancement Field");
        EnhancedFieldGame enhancedFieldGame = new EnhancedFieldGame();
        fields.add(enhancedFieldGame);
        money = money - enhancedFieldGame.sowingCost;
        System.out.println(money);
    }


    public void NextTurn(){
        // go through the fields and calculate profit, add it to money
        System.out.println("Next Turn");
        for(Field f: fields){
            money = money + f.calculateProfit();
        }
        for(Cow c: cows){
            money = money + c.getMilk();
        }
        System.out.println(money);
    }

    public void buyCow() {
        System.out.println("Buying Cow");
        Cow cow = new Cow();
        cows.add(cow);
        money = money - 200;
        System.out.println(money);
    }


    @Override
    public String toString() {
        StringBuilder a = new StringBuilder();
        for(Field f: fields){
            a.append(f.getClass().getSimpleName());
        }
        return a.toString();
    }

}




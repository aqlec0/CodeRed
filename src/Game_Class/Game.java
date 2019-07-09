package Game_Class;

import java.util.Scanner;

public class Game {


    public static void main(String[] args) {

        /*Inventory inventory = new Inventory();
        System.out.println(inventory.money);
        System.out.println("How many fields do you want to buy?");
        Scanner scanner = new Scanner(System.in);
        int numberOfFields = scanner.nextInt();

        for (int i = 1; i <= numberOfFields && inventory.money < 10000; i++) {
            inventory.buySimplerField();
            inventory.NextTurn();
            System.out.println("Money = " + inventory.money);
        }
        //TODO 7: Loop the entire reading user input until player gets to 10,000 money */
        //test

        printUserMenu();

    }

    public static void printUserMenu(){

        System.out.println("Welcome to my game, choose proper number: \n" +
                "Options:\n" +
                "1 – Buy standard field\n" +
                "2 – Buy Strawberry Field\n" +
                "3 – Buy Enhanced Field\n" +
                "4 – Show inventory\n" +
                "5 – Next turn\n" +
                "6 – Buy a Cow\n" +
                "7 – Exit Game (I give up)");


        //inventoryMenu.buyStrawberryField();
        //inventoryMenu.buyStrawberryField();
         int temp = 1;
        do {
            Scanner numbers = new Scanner(System.in);
            int number = numbers.nextInt();

            Inventory inventoryMenu = new Inventory();
            switch (number) {
                case 1:
                    inventoryMenu.buySimplerField();
                    break;
                case 2:
                    inventoryMenu.buyStrawberryField();
                    break;
                case 3:
                    inventoryMenu.buyEnhancementFieldGame();
                    break;
                case 4:
                    inventoryMenu.toString();
                    break;
                case 5:
                    inventoryMenu.NextTurn();
                    break;
                case 6:
                    inventoryMenu.buyCow();
                    break;
                case 7:
                    System.out.println("I give up");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong number!");
            }
        }
        while(temp == 1);


    }
}

//test gitmerge
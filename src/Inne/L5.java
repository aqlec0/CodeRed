package Inne;

public class L5<sum> {

    public static void main(String[] args) {

        /*Animal polly = new Animal();
        polly.age = 10;
        polly.weight = 20;

        polly.sleep();

        Animal alfa = new Animal();
        alfa.age = 2;
        alfa.weight = 10;

        System.out.println(polly.isOlder(alfa));
        System.out.println(polly.isOlder(polly));

        System.out.println("alfa needs kg of food " + alfa.howmuchshouldIeat()); */

        /*Inne.Product apple = new Inne.Product();
        apple.price = 100;
        apple.quantityInStore = 5;
        apple.name = "Apple";
        System.out.println(apple.totalPrice());*/

        Product banana = new Product(10,20,"banana");
        Product table = new Product(1,200,"table");
        Product computer = new Product(4,50,"computer");
        System.out.println(banana.totalPrice());
        System.out.println(table.totalPrice());
        System.out.println(computer.totalPrice());

        Product[] products = new Product[3];
        products[0] = banana;
        products[1] = table;
        products[2] = computer;

        double sum = 0;
        for (int i=0; i<=2; i++)
            {
            sum = sum + products[i].totalPrice();
            }
        System.out.println(sum);
        System.out.println(products[0]);




        }



    }





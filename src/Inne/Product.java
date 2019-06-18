package Inne;

public class Product {

    double quantityInStore;
    double price;
    String name;



    double totalPrice(){
        return quantityInStore*price;
    }

    Product(double quantityInStore, double price, String name){  //zapewnie ze podamy all parametry
        this.quantityInStore = quantityInStore;
        this.price = price;
        this.name = name;

    }

    public String toString(){
        return name;
    }

}

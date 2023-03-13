//Online Shopping System: In an online shopping system, there may be a superclass called Product with a method called calculateDiscount() that calculates the discount on the product's price. Different types of products, such as Electronics and Apparel, may be subclasses of Product and override the calculateDiscount() method to calculate the discount based on their specific sales and promotions. For example, an Electronics product may offer a discount based on the purchase amount or bundle deals, while an Apparel product may offer a discount based on the seasonal trends or inventory clearance

import java.util.Scanner;

class Product {
    int id;
    double price;
    
    public Product(int id, double price) {
        this.id = id;
        this.price = price;
    }
    
    public double calculateDiscount() {
        return 0.0; 
    }
}

class Electronics extends Product {
    public Electronics(int id, double price) {
        super(id, price);
    }
    
    public double calculateDiscount(double purchaseAmount) {
        if (purchaseAmount >= 1000.0) {
            return 0.1 * price; 
        } else {
            return 0.05 * price; 
        }
    }
}

class Apparel extends Product {
    public Apparel(int id, double price) {
        super(id, price);
    }
    
    public double calculateDiscount(String season) {
        if (season.equals("Summer")) {
            return 0.2 * price; 
        } else {
            return 0.1 * price; 
        }
    }
}

public class OnlineShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Electronics phone = new Electronics(231, 23123.0);
        double phoneDiscount = phone.calculateDiscount(21623.0);
        System.out.println("Phone discount: " + phoneDiscount);
        
        Apparel dress = new Apparel(132, 812.0);
        double dressDiscount = dress.calculateDiscount("Summer");
        System.out.println("dress discount: " + dressDiscount);
    }
}

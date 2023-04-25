/*Create a mini project in Java that models a simple online shopping system. The system should allow users to view products, add them to a shopping cart, and check out. The project should utilize inheritance, interfaces, overriding, collections, and custom exceptions.

Here are the basic requirements:

Create an interface called "Product" that defines the basic properties of a product such as the name, description, price, and quantity.
Create two classes that implement the "Product" interface: "ElectronicProduct" and "ClothingProduct". "ElectronicProduct" should have additional properties such as brand and warranty while "ClothingProduct" should have additional properties such as size and color.
Create a class called "ShoppingCart" that stores the products selected by the user.
Create a class called "Checkout" that handles the payment and shipping of the products in the shopping cart.
Use custom exceptions to handle cases such as insufficient stock or invalid payment information.
Implement additional features such as search,*/
import java.util.*;

interface Product {
    String getName();
    String getDescription();
    double getPrice();
    int getQuantity();
}

class ElectronicProduct implements Product{
  private String name;
  private String description;
  private double price;
  private int quantity;
  private String brand;
  private int warranty;

  public ElectronicProduct(String name, String description, double price, int quantity, String brand,int warranty){
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.brand = brand;
    this.warranty = warranty;
  } 
    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }

    public String toString() {
        return "Product: " + name + " " + "Description: " + description  + " " + "Price: $" + price + " " +  "Quantity: " + quantity;
               
    } 
  
}

class ClothingProduct implements Product{
  private String name;
  private String description;
  private double price;
  private int quantity;
  private int size;
  private String color;

  public ClothingProduct(String name, String description, double price, int quantity, int size,String color){
    this.name = name;
    this.description = description;
    this.price = price;
    this.quantity = quantity;
    this.size = size;
    this.color = color;
  }
    public String getName(){
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

   public String toString() {
        return "Product: " + name + " " + "Description: " + description  + " " + "Price: $" + price + " " +  "Quantity: " + quantity;
               
    } 
}

class ShoppingCart{
 private ArrayList<Product> products = new ArrayList<>();

  public void addProduct(Product product){
    products.add(product);
  }

  public void removeProduct(Product product){
    products.remove(product);
  }

   public ArrayList<Product> getProducts() {
        return products;
    }
  
    double calculateTotalPrice() { 
    double totalPrice = 0;
    for (int i = 0; i < products.size(); i++) {
      totalPrice += products.get(i).getPrice();
    }
    return totalPrice;
  }
}

class Checkout{
  
}

public class OnlineShoppingSystem{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<Product> products= new ArrayList<>();
        products.add(new ElectronicProduct("Iphone", "A13 chip", 1099.00, 10, "Apple", 1));
        products.add(new ElectronicProduct("Samsung", "Exynos chip", 1199.00, 5, "Android", 2));
        products.add(new ElectronicProduct("Microsoft", "Haybusa chip", 999.00, 9, "Microsoft", 1));
        products.add(new ClothingProduct("Adidas", "Running shoes", 180.00, 20, 8, "Black"));
        products.add(new ClothingProduct("Nike", "Lifestyle shoes", 150.00, 30, 9, "White"));
        products.add(new ClothingProduct("Reebok", "Fashion shoes", 200.00, 20, 9, "Blue"));

    System.out.println("The items in the shop are :");
     for (Product product : products) {
        System.out.println(product);
     }
        
        ShoppingCart cart = new ShoppingCart();
     
    while (true) {
            System.out.println("1. Add item to cart");
            System.out.println("2. Remove item from cart");
            System.out.println("3. View cart");
            System.out.println("4. Total price of product in cart");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            
            int choice = scanner.nextInt();
            switch(choice){
              case 1:
                  System.out.println("Please enter the name of the product to add to cart:");
                    String productName = scanner.next();
                    for (Product product : products) {
                        if (product.getName().equals(productName)) {
                            cart.addProduct(product);
                            System.out.println("Product added to cart: " + product.getName());
                            break;
                        }
                    }
                    break;
              case 2:
                System.out.println("Please enter the name of the product to remove from cart:");
                    String removeProduct = scanner.next();
                    for (Product product : products) {
                        if (product.getName().equals(removeProduct)) {
                            cart.removeProduct(product);
                            System.out.println("Product removed from cart: " + product.getName());
                            break;
                        }
                    }
                    break;
              case 3:
                for (Product product : cart.getProducts()) {
                        System.out.println(product.getName() + " - " + product.getPrice());
                    }
                    break;
              case 4:
                System.out.println("Total price: " + cart.calculateTotalPrice());
                break;
              case 5: {
                System.exit(0);
              }
               default :{
                 System.out.println("invalid choice"); 
               }
            }
    }
  }
}
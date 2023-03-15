//Create an interface Animal with the following methods:
//public void speak();
//public void eat();
//Create classes Dog, Cat, and Cow that implement this interface. Write a program that accepts the type of animal and calls its speak() and eat() methods.
import java.util.Scanner;
interface Animal {
    void speak();
    void eat();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("Bow bow!");
    }

    public void eat() {
        System.out.println("Eating bones");
    }
}

class Cat implements Animal {
    public void speak() {
        System.out.println("Meow!");
    }

    public void eat() {
        System.out.println("Eating fish");
    }
}

class Cow implements Animal {
    public void speak() {
        System.out.println("Moo!");
    }

    public void eat() {
        System.out.println("Eating grass");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      String animalType = sc.next();
      Animal animal;
        switch (animalType.toUpperCase()) {
            case "DOG":
                animal = new Dog();
                break;
            case "CAT":
                animal = new Cat();
                break;
            case "COW":
                animal = new Cow();
                break;
            default:
                System.out.println("Invalid animal type");
                return;
        }
        animal.speak();
        animal.eat();
    }
}
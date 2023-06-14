//Math Operations: Create a class called MathOperations with overloaded methods for performing basic math operations. Implement methods such as add(int a, int b), add(double a, double b), subtract(int a, int b), subtract(double a, double b), multiply(int a, int b), multiply(double a, double b), divide(int a, int b), and divide(double a, double b). Test the methods by calling them with different arguments.
public class Overloading{
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public double subtract(double a, double b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double multiply(double a, double b) {
        return a * b;
    }
    
    public int divide(int a, int b) {
        return a / b;
    }
    
    public double divide(double a, double b) {
        return a / b;
    }
    
    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
      
        System.out.println("Addition:");
        System.out.println(mathOps.add(5, 3));
        System.out.println(mathOps.add(2.5, 1.5));
        
        System.out.println("Subtraction:");
        System.out.println(mathOps.subtract(8, 4));
        System.out.println(mathOps.subtract(5.5, 1.2));
        
        System.out.println("Multiplication:");
        System.out.println(mathOps.multiply(4, 6));
        System.out.println(mathOps.multiply(2.5, 3.5));
        
        System.out.println("Division:");
        System.out.println(mathOps.divide(10, 2));
        System.out.println(mathOps.divide(5.6, 2.0));
    }
}
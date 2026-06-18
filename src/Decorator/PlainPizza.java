package Decorator;

public class PlainPizza implements Pizza{
    @Override
    public String getDescription() {
        System.out.println("Inside PlainPizza -> getDescription method");
        return "Plain pizza";
    }

    @Override
    public double cost() {
        System.out.println("Inside PlainPizza -> cost method");
        return 8.0; // Base price of the pizza
    }
}

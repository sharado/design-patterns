package Decorator;

public class CheeseDecorator extends PizzaDecorator{

    public CheeseDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        System.out.println("Inside CheeseDecorator -> getDescription method");
        return pizza.getDescription() + ", cheese";
    }

    @Override
    public double cost() {
        System.out.println("Inside CheeseDecorator -> cost method");
        return pizza.cost() + 1.5; // Cost of cheese topping
    }
}

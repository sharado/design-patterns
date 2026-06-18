package Decorator;

public class PepperoniDecorator extends PizzaDecorator{

    public PepperoniDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        System.out.println("Inside PepperoniDecorator -> getDescription method");
        return pizza.getDescription() + ", pepperoni";
    }

    @Override
    public double cost() {
        System.out.println("Inside PepperoniDecorator -> cost method");
        return pizza.cost() + 2.0; // Cost of pepperoni topping
    }
}

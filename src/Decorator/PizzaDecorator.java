package Decorator;

abstract class PizzaDecorator implements Pizza{
    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza){
        System.out.println("Inside PizzaDecorator -> constructor");
        this.pizza = pizza;
    }

    /*@Override
    public String getDescription() {
        return pizza.getDescription();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }*/
}

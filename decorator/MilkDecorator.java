package decorator;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.0;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", с молоком";
    }
}

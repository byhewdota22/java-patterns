package decorator;

public class Main {
    public static void main(String[] args) {
        Coffee espresso = new Espresso();
        System.out.println(espresso.getDescription() + " = " + espresso.getCost() + " руб.");

        Coffee withSugar = new SugarDecorator(new Espresso());
        System.out.println(withSugar.getDescription() + " = " + withSugar.getCost() + " руб.");

        Coffee withMilk = new MilkDecorator(new Espresso());
        System.out.println(withMilk.getDescription() + " = " + withMilk.getCost() + " руб.");

        Coffee withSugarAndMilk = new MilkDecorator(new SugarDecorator(new Espresso()));
        System.out.println(withSugarAndMilk.getDescription() + " = " + withSugarAndMilk.getCost() + " руб.");

    }
}

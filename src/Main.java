import services.BaseCoffee;
import services.impl.CapichinoCoffeeImpl;
import services.impl.WithSandwhich;

public class Main {
    public static void main(String[] args) {

        BaseCoffee coffee = new CapichinoCoffeeImpl();
        BaseCoffee coffeeWithSandwhich = new WithSandwhich(coffee);
        System.out.println("cost of coffee with Sandwhich is : " + coffeeWithSandwhich.getCost());
    }
}
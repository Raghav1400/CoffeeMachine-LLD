package services;

public abstract class WithAddOn extends BaseCoffee {
    public BaseCoffee baseCoffee;

    public WithAddOn(BaseCoffee baseCoffee) {
        this.baseCoffee= baseCoffee;
    }
}

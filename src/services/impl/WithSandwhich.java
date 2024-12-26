package services.impl;

import services.BaseCoffee;
import services.WithAddOn;

public class WithSandwhich extends WithAddOn {

    public WithSandwhich(BaseCoffee baseCoffee) {
        super(baseCoffee);
    }

    @Override
    public int getCost() {
        return 20 + baseCoffee.getCost();
    }
}

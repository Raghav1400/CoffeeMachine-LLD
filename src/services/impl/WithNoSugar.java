package services.impl;

import services.BaseCoffee;
import services.WithAddOn;

public class WithNoSugar extends WithAddOn {
    public WithNoSugar(BaseCoffee baseCoffee){
        super(baseCoffee);
    }
    @Override
    public int getCost() {
        return 2 + baseCoffee.getCost();
    }
}

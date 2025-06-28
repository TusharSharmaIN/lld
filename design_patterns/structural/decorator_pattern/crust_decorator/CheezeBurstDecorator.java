package design_patterns.structural.decorator_pattern.crust_decorator;

import design_patterns.structural.decorator_pattern.base_pizza.BasePizza;

public class CheezeBurstDecorator extends CrustDecorator {
    BasePizza basePizza;

    public CheezeBurstDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 50;
    }

    @Override
    public String name() {
        return basePizza.name() + " Cheez Burst";
    }
}

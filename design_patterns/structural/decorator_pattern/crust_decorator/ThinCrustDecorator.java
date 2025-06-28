package design_patterns.structural.decorator_pattern.crust_decorator;

import design_patterns.structural.decorator_pattern.base_pizza.BasePizza;

public class ThinCrustDecorator extends CrustDecorator {

    BasePizza basePizza;

    public ThinCrustDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }

    @Override
    public String name() {
        return basePizza.name() + " Thin Crust";
    }

}
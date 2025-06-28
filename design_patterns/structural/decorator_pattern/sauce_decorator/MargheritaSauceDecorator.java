package design_patterns.structural.decorator_pattern.sauce_decorator;

import design_patterns.structural.decorator_pattern.base_pizza.BasePizza;

public class MargheritaSauceDecorator extends SauceDecorator {
    BasePizza basePizza;

    public MargheritaSauceDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }

    @Override
    public String name() {
        return basePizza.name() + " Margherita";

    }

}

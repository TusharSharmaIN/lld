package design_patterns.structural.decorator_pattern.sauce_decorator;

import design_patterns.structural.decorator_pattern.base_pizza.BasePizza;

public class MarinaraSauceDecorator extends SauceDecorator {
    BasePizza basePizza;

    public MarinaraSauceDecorator(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 20;
    }

    @Override
    public String name() {
        return basePizza.name() + " Marinara";
    }

}
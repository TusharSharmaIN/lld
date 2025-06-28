package design_patterns.structural.decorator_pattern.base_pizza;

public class ChickenFiesta implements BasePizza {

    @Override
    public int cost() {
        return 120;
    }

    @Override
    public String name() {
        return "Chicken Fiesta";
    }

}

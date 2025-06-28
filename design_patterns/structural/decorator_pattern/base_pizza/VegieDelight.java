package design_patterns.structural.decorator_pattern.base_pizza;

public class VegieDelight implements BasePizza {

    @Override
    public int cost() {
        return 90;
    }

    @Override
    public String name() {
        return "Vegie Delight";
    }
    
}

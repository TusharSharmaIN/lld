package design_patterns.structural.decorator_pattern;

import design_patterns.structural.decorator_pattern.base_pizza.*;
import design_patterns.structural.decorator_pattern.crust_decorator.CheezeBurstDecorator;
import design_patterns.structural.decorator_pattern.crust_decorator.CrustDecorator;
import design_patterns.structural.decorator_pattern.crust_decorator.ThinCrustDecorator;
import design_patterns.structural.decorator_pattern.sauce_decorator.*;

public class DecoratorPatternRunner {
    public static void main(String[] args) {
        System.out.println("Dcorator Pattern Runner");

        BasePizza vegPizza = new VegieDelight();
        System.out.println(vegPizza.name() + ": " + vegPizza.cost());

        BasePizza chickenPizza = new ChickenFiesta();
        System.out.println(chickenPizza.name() + ": " + chickenPizza.cost());

        SauceDecorator marinaraSauce = new MarinaraSauceDecorator(vegPizza);
        System.out.println(marinaraSauce.name() + ": " + marinaraSauce.cost());
        SauceDecorator margheritaSauce = new MargheritaSauceDecorator(chickenPizza);
        System.out.println(margheritaSauce.name() + ": " + margheritaSauce.cost());

        CrustDecorator vegCheezBurstDecrator = new CheezeBurstDecorator(vegPizza);
        System.out.println(vegCheezBurstDecrator.name() + ": " + vegCheezBurstDecrator.cost());
        CrustDecorator marinaraNonvegCheezBurstDecrator = new CheezeBurstDecorator(marinaraSauce);
        System.out.println(marinaraNonvegCheezBurstDecrator.name() + ": " + marinaraNonvegCheezBurstDecrator.cost());

        CrustDecorator chickenThinCrustDecrator = new ThinCrustDecorator(chickenPizza);
        System.out.println(chickenThinCrustDecrator.name() + ": " + chickenThinCrustDecrator.cost());
        CrustDecorator marinaraChickenThinCrustDecrator = new ThinCrustDecorator(margheritaSauce);
        System.out
                .println(marinaraChickenThinCrustDecrator.name() + ": " +
                        marinaraChickenThinCrustDecrator.cost());
    }
}

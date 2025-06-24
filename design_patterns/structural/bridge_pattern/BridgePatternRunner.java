package design_patterns.structural.bridge_pattern;

import design_patterns.structural.bridge_pattern.renderer.*;
import design_patterns.structural.bridge_pattern.shape.*;

public class BridgePatternRunner {
    public static void main(String[] args) {
        System.out.println("Brigde Pattern Runner");
        
        Renderer vector = new VectorRenderer();
        Renderer rastor = new RastorRenderer();

        Shape circle1 = new Circle(vector, 5);
        Shape circle2 = new Circle(rastor, 10);

        Shape rectangle1 = new Rectangle(vector, 10, 5);
        Shape rectangle2 = new Rectangle(rastor, 20, 15);

        circle1.draw();
        circle2.draw();
        rectangle1.draw();
        rectangle2.draw();
    }
}

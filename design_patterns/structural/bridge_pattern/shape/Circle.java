package design_patterns.structural.bridge_pattern.shape;

import design_patterns.structural.bridge_pattern.renderer.Renderer;

public class Circle extends Shape {
    private final float radius;

    public Circle(Renderer renderer, float radius) {
        super(renderer);
        this.radius = radius;
    }

    @Override
    public void draw() {
        renderer.renderCircle(radius);
    }

}

package design_patterns.bridge_pattern.shape;

import design_patterns.bridge_pattern.renderer.Renderer;

public class Rectangle extends Shape {
    private final float length;
    private final float width;

    public Rectangle(Renderer renderer, float length, float width) {
        super(renderer);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        renderer.renderRectangle(length, width);
    }

}

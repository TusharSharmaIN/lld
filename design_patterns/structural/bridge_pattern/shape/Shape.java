package design_patterns.structural.bridge_pattern.shape;

import design_patterns.structural.bridge_pattern.renderer.Renderer;

public abstract class Shape {
    protected Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract void draw();
}

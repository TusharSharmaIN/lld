package design_patterns.structural.bridge_pattern.renderer;

public class RastorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing Circle with radius: " + radius + ", (Rastor Rendering)");
    }

    @Override
    public void renderRectangle(float length, float width) {
        System.out.println("Drawing Rectangle with length: " + length + ", width: " + width + ", (Rastor Rendering)");
    }
}

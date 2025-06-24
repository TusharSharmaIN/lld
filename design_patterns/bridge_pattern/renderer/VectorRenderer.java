package design_patterns.bridge_pattern.renderer;

public class VectorRenderer implements Renderer {
    @Override
    public void renderCircle(float radius) {
        System.out.println("Drawing Circle with radius: " + radius + ", (Vector Rendering)");
    }

    @Override
    public void renderRectangle(float length, float width) {
        System.out.println("Drawing Rectangle with length: " + length + ", width: " + width + ", (Vector Rendering)");
    }
}
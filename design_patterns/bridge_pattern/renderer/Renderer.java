package design_patterns.bridge_pattern.renderer;

public interface Renderer {
    void renderCircle(float radius);
    void renderRectangle(float length, float width);
}
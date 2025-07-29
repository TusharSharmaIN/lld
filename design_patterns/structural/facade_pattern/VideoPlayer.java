package design_patterns.structural.facade_pattern;

public class VideoPlayer {
    public void setupRenderingEngine() {
        System.out.println("Rendering engine set up.");
    }
    public void loadVideoFile() {
        System.out.println("Video file loaded.");
    }
    public void playVideo() {
        System.out.println("Video playback started.");
    }
}

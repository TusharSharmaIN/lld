package design_patterns.creational.builder_pattern;

public class BuilderPatternRunner {
    public static void main(String[] args) {
        HttpRequest request1 = new HttpRequest.HttpRequestBuilder("https://goog.co.in").build();

        HttpRequest request2 = new HttpRequest.HttpRequestBuilder("https://goog.co.in").timout(2000).build();

        System.out.println(request1.toString());
        System.out.println(request2.toString());
    }
}

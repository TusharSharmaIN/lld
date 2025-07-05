package design_patterns.creational.builder_pattern;

import java.util.HashMap;
import java.util.Map;

public class HttpRequest {
    private final String url;

    // optional
    private final String method;
    private final Map<String, String> headers;
    private final Map<String, String> queryParamaters;
    private final String body;
    private final int timeout;

    private HttpRequest(HttpRequestBuilder builder) {
        this.url = builder.url;
        this.method = builder.method;
        this.headers = builder.headers;
        this.queryParamaters = builder.queryParamaters;
        this.body = builder.body;
        this.timeout = builder.timeout;
    }

    public String getUrl() {
        return this.url;
    }

    public String getMethod() {
        return this.method;
    }

    public Map<String, String> getHeaders() {
        return this.headers;
    }

    public Map<String, String> getQueryParamaters() {
        return this.queryParamaters;
    }

    public String getBody() {
        return this.body;
    }

    public int getTimeout() {
        return this.timeout;
    }

    @Override
    public String toString() {
        return "HttpRequest{" +
                "url='" + url + '\'' +
                ", method='" + method + '\'' +
                ", headers=" + headers +
                ", queryParams=" + queryParamaters +
                ", body='" + (body != null ? body.substring(0, Math.min(10, body.length())) + "..." : "null") + '\'' +
                ", timeout=" + timeout +
                '}';
    }

    public static class HttpRequestBuilder {
        private String url;
        private String method = "GET";
        private Map<String, String> headers = new HashMap<>();
        private Map<String, String> queryParamaters = new HashMap<>();
        private String body;
        private int timeout = 30000;

        public HttpRequestBuilder(String url) {
            this.url = url;
        }

        public HttpRequestBuilder method(String method) {
            this.method = method;
            return this;
        }

        public HttpRequestBuilder addHeaders(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public HttpRequestBuilder addQueryParamaters(Map<String, String> queryParamaters) {
            this.queryParamaters = queryParamaters;
            return this;
        }

        public HttpRequestBuilder body(String body) {
            this.body = body;
            return this;
        }

        public HttpRequestBuilder timout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public HttpRequest build() {
            return new HttpRequest(this);
        }
    }
}

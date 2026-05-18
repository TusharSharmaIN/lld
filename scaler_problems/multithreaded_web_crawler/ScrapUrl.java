
public class ScrapUrl implements Runnable {

    private String url;

    public ScrapUrl(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
    }
}

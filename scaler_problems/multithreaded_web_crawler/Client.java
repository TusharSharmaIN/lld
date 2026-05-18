
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws Exception {
        List<String> urls = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            urls.add("http://example.com/page" + i);
        }

        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(10);
        long fixedTime = executeTasks(urls, fixedThreadPool);
        System.out.println("Fixed Thread Pool: " + fixedTime + " ms");

        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        long cachedTime = executeTasks(urls, cachedThreadPool);
        System.out.println("Cached Thread Pool: " + cachedTime + "ms");

    }

    private static long executeTasks(List<String> urls, ExecutorService executor) throws Exception {
        List<Future<?>> futures = new ArrayList<>();

        long start = System.currentTimeMillis();

        for (String url : urls) {
            futures.add(executor.submit(new ScrapUrl(url)));
        }

        for (Future<?> future : futures) {
            future.get();
        }

        long end = System.currentTimeMillis();
        executor.shutdown();

        return end - start;
    }
}


import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) throws Exception {
        List<Integer> numbers = new ArrayList<>();
        int CAP = 1000000;
        for (int i = 0; i < CAP; i++) {
            numbers.add(i);
        }

        int numCores = Runtime.getRuntime().availableProcessors();

        // MultiThreadedSum 
    }
}


import java.util.concurrent.Callable;

public class MultiThreadedSum implements Callable<Long> {

    private int[] numbers;
    private int start, end;

    public MultiThreadedSum(int[] numbers, int start, int end) {
        this.numbers = numbers;
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() throws Exception {
        Long sum = new Long(0);
        for (int i = 0; i < 10; i++) {
            sum += this.numbers[i];
        }

        return sum;
    }

}

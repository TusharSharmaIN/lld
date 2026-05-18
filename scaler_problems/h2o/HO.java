
import java.util.concurrent.Semaphore;

public class HO {

    private int n;
    private Semaphore hSema;
    private Semaphore sSema;

    public HO(int n) {
        this.n = n;
        hSema = new Semaphore(1);
        sSema = new Semaphore(0);
    }

    public void printH() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            hSema.acquire();
            System.err.println("H");
            sSema.release();
        }
    }

    public void printO() throws InterruptedException {
        for (int i = 0; i < n; i++) {
            sSema.acquire();
            System.err.println("H");
            hSema.release();
        }
    }
}

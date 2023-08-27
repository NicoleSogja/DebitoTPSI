import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
  public static void main(final String[] args) {
    final int TURISTI = 20;
    final int NUM_RUBINETTI = 3;
    final int capacitaBotte = 100;
    
    Semaphore semaforo = new Semaphore(NUM_RUBINETTI);
    Bottiglia botte = new Bottiglia(capacitaBotte);
    for (int i = 0; i < TURISTI; i++) {
      Bevitore bevitore = new Bevitore(semaforo,botte);
      bevitore.start();
    }
  }
}

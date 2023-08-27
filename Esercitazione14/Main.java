import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicInteger;

class Main {
  public static void main(final String[] args) {
    final int COMPRATORI = 20;
    final int NUM_VENDITORI = 5;
    final int BIGLIETTI_MAX = 100;
    
    Semaphore semaforo = new Semaphore(NUM_VENDITORI);
    Biglietti biglietti = new Biglietti(BIGLIETTI_MAX);
    
    for (int i = 0; i < COMPRATORI; i++) {
      Compratori compratori = new Compratori(semaforo,biglietti);
      compratori.start();
    }
  }
}
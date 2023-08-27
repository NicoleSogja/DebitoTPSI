import java.util.concurrent.Semaphore;

class Compratori extends Thread {
  
  private Semaphore semaforo = new Semaphore(5);
  private Biglietti biglietti;

  public Compratori(Semaphore semaforo, Biglietti biglietti) {
    this.semaforo = semaforo;
    this.biglietti = biglietti;
  }

  @Override
  public void run() {
    while (true) {
      try {
        semaforo.acquire();
        if (biglietti.getCount() > 0) {
          if (semaforo.availablePermits() > 0) {
            biglietti.decrementCount();
            System.out.println("Biglietti rimanenti: " + biglietti.getCount());
            Thread.sleep(3000);
          } else {
            Thread.sleep(3000);
          }
        } else {
          System.out.println("Botte finita!");
          Thread.currentThread().interrupted();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      } finally {
        semaforo.release();
      }
    }
  }

}
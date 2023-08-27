import java.util.concurrent.Semaphore;

class Bevitore extends Thread {
  private Semaphore semaforo = new Semaphore(3);
  private Bottiglia bottiglia;
  

  public Bevitore(Semaphore semaforo,Bottiglia bottiglia){
    this.semaforo= semaforo;
    this.bottiglia = bottiglia;
  }

  @Override
  public void run (){
    while(true){
    try {
      semaforo.acquire();
        if (bottiglia.getCount() > 0) {
          if(semaforo.availablePermits()>0){
                bottiglia.decrementCount();
                System.out.println("Litri rimanenti: " + bottiglia.getCount());
                Thread.sleep(3000);
          }else{
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
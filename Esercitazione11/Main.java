import java.util.concurrent.Semaphore;

public class Main {
  
  public static void main(String[] args)  throws InterruptedException {
    Semaphore telescopio = new Semaphore(1);

      for (int i = 0; i < 10; i++){
          new Thread(() -> {
            synchronized(telescopio){
              if (telescopio.availablePermits() == 0) {
                try{                      
                  telescopio.wait(); 
                } catch (InterruptedException e) {
                   e.printStackTrace();
                }
              }else {
                try {
                  telescopio.acquire();
                  System.out.println("Thread " + Thread.currentThread().getId() + " in Osservazione");
                  Thread.sleep(3000); 
                } catch (InterruptedException e) {
                  e.printStackTrace();
                } finally {
                  telescopio.release();
                  System.out.println("Thread " + Thread.currentThread().getId() + " Finito");
                  telescopio.notifyAll();
              }
            }
          }
        }).start();
     }
  }
}

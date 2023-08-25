import java.util.concurrent.Semaphore;

class Main {
  public static void main(String[] args) {
    Semaphore semaforo = new Semaphore(5);
    for(int i=0;i<50;i++){
      Thread turista= new Thread(()->{
        synchronized(semaforo){
        if(semaforo.availablePermits()==0){
          try{
            System.out.print("SALA PIENA!");
            semaforo.wait();
          }catch(InterruptedException e){
            e.printStackTrace();
          }
        }else{
          try{
            semaforo.acquire();
            Thread.sleep(new Random().nextInt(7000) + 3000);
          }catch(InterruptedException e){
            e.printStackTrace();
          }finally{
            semaforo.release();
            semaforo.notifyAll();
          }
        }
       }
      });
        
      turista.start();
        
         
    }
  }
}
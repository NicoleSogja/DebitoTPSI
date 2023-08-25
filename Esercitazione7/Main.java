import org.junit.internal.runners.InitializationError;

class Main {
  public static void main(String[] args) {
   Conto conto = new Conto(10000);

    //mettiamo una lambda fuction per fare più velocemente
    Thread padre = new Thread(() -> {
      for(int i=0;i<5;i++){
        conto.deposito(1000);
        try{
          Thread.sleep(500);
        }catch(InterruptedException e){
          e.printStackTrace();
        }
      }
    });

    padre.start();

    int numFigli = 3;
    Thread[] figli = new Thread[numFigli];

    for(int i=0; i<numFigli;i++){
      //un'altra lambda function per renderlo piu semplice
      figli[i] = new Thread(()->{
        while(true){
          double importo = Math.random()*1000;
          conto.prelievo(importo);
          try{
            Thread.sleep(300);
          }catch(InterruptedExcepiton e){
            e.printStackTrace();
          }
        }
      });
      figli[i].start();
    }
    
  }
}
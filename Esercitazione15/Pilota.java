class Pilota extends Thread {
    private Kart kart;
    private Spogliatoi spogliatoi;
    private int giri = 15;

    public Pilota(Kart kart, Spogliatoi spogliatoi) {
        this.kart = kart;
        this.spogliatoi = spogliatoi;
    }

    @Override
    public void run() {
      giri = 15;
      while (true) {
        try {
          synchronized (this) {
             
            while (spogliatoi.getCount() <= 0) {
            wait(); 
            }
            
              System.out.println("Entrato nello spogliatoio");
              spogliatoi.decrementCount();

              Thread.sleep(3000);
              
            
            synchronized (kart) {
              while (kart.getCount() <= 0) {
              kart.wait(); 
            }
            while(giri>0){
              System.out.println("Entrato in pista giro " +giri );
              kart.decrementCount();
              Thread.sleep(3000);
              giri--;
            }
            kart.incrementCount();
            System.out.println("Uscito dalla pista");
            kart.notifyAll();
          }

          spogliatoi.incrementCount();
          System.out.println("Uscito dallo spogliatoio");
          notifyAll();
        }
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

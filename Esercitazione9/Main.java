class Main {
  public static void main(String[] args) {
    
    
    Thread orario = new Thread (()->{
      long tempoInizio= System.currentTimeMillis();
      try{
      Thread.sleep(10000);
      }catch(InterruptedException e){
        long tempoFine = System.currentTimeMillis();
        long tempoTrascorso = tempoFine -tempoInizio;
        System.out.println("Il tempo trascorso è pari a "+ (tempoTrascorso/1000) + " secondi");
      }
    });

    orario.start();
    try{
      Thread.sleep(5000);
    }catch(InterruptedException e){
      e.printStackTrace();
    }
    
    orario.interrupt();
  }
}
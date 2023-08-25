class CokeMachine {
  private static final int N = 50;  //Capacità della macchinetta     
  private int count = N; 
  //Numero effettivo di lattine presenti nella macchinetta

  public synchronized void remove(int lattine)throws InterruptedException{

    if(count >= lattine){
      count -= lattine;
        System.out.println("Le lattine rimaste sono pari a "+ count);
    
    }else {
            System.out.println("Non ci sono abbastanza lattine disponibili.");
        }
    
    notifyAll();
    
}
  
  public synchronized void deposit()throws InterruptedException{
    if(count==0){
      count+=N;
      System.out.println("Le lattine sono state rifornite ");
      notifyAll();
      wait();
    }
    
  }

  public synchronized int getCount(){
    return count;
  }
}
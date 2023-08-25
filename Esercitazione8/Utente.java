public class Utente extends Thread{
  CokeMachine macchinetta = new CokeMachine();
  private int lattine=0;

  public Utente(CokeMachine macchinetta, int lattine){
    this.macchinetta= macchinetta;
    this.lattine = lattine;
  }

  @Override
  public void run(){
    while(true){
      try{
        macchinetta.remove(lattine);
        sleep(1000);
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
  }
}
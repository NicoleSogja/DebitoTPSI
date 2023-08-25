public class Rifornitore extends Thread{
  CokeMachine macchinetta = new CokeMachine();

  public Rifornitore(CokeMachine macchinetta){
    this.macchinetta = macchinetta;
  }

  @Override
  public void run(){
    while(true){
      try{
      macchinetta.deposit();
      }catch(InterruptedException e ){
        e.printStackTrace();
      }
    }
  }
}
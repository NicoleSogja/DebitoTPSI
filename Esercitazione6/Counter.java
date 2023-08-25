public class Counter{
  private int count;

  public synchronized void increment(){
    if(count<10){
      count++;
      System.out.print("Incrementato a "+ count);
    }
  }
  public synchronized void decrement(){
    if(count>0){
      count--;
      System.out.print("Decrementato a "+ count);
    }
  }
}
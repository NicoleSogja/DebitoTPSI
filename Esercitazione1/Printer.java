public class Printer extends Thread{
  private char symbol;

  public Printer(char symbol){
    this.symbol = symbol;
  }

  @Override
  public void run() {
    int count = 0;
    while (true) {
      System.out.print(symbol);
      count++;

      if (count % 50 == 0) {
        System.out.println();
      }

      try {
        Thread.sleep(100); 
              
      } catch (InterruptedException e) {
        e.printStackTrace();
        }
      }
  }
}
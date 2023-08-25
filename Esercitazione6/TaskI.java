class TaskI extends Thread{
  private Counter count;
  
  public TaskI(Counter count){
    this.count = count;
  }

  @Override
  public void run (){
    while(true){
      try{
        Thread.sleep((long)(Math.random()*1000));
        count.increment();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
    
  }
}
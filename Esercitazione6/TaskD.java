class TaskD extends Thread{
  private Counter count;
  
  public TaskD(Counter count){
    this.count = count;
  }

  @Override
  public void run (){
    while(true){
      try{
        Thread.sleep((long)(Math.random()*1000));
        count.decrement();
      }catch(InterruptedException e){
        e.printStackTrace();
      }
    }
    
  }
}
class Main {
  public static void main(String[] args) {
    Counter count = new Counter();
    TaskI taski = new TaskI(count);
    TaskD taskd = new TaskD(count);
    
    for (int i = 0; i < 5; i++) {
      taskd.start();
      taski.start();
    }
    // se non ci fosse stato synchronized ci sarebbe stato un casino, una probabile dedlock per esempio
    
  }
}
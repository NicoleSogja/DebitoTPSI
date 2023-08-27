class Spogliatoi{
  private int count;

  public Spogliatoi(int initialCount) {
    this.count = initialCount;
  }

  public synchronized int getCount() {
    return count;
  }

  public synchronized void decrementCount() {
    if (count > 0) {
      count--;
    }
  }
  public synchronized void incrementCount() {
    if (count <2 ) {
      count++;
    }
  }
}
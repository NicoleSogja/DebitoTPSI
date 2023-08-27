class Kart{
  private int count;

  public Kart(int initialCount) {
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
    if (count <5 ) {
      count++;
    }
  }
}
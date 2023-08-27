class Biglietti {
  private int count;

  public Biglietti(int initialCount) {
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
}
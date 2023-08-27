class Bottiglia {
    private int count;

    public Bottiglia(int initialCount) {
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